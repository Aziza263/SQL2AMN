package SQL2AMN.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.util.List;

public class SQL2AMNTransformer {

    private final ResourceSet resourceSet;
    private final Resource inputResource;
    private Resource outputResource;

    private EPackage sqlPackage;
    private EPackage amnPackage;
    private EFactory amnFactory;

    private EClass sqlProgram;
    private EClass procedure;
    private EClass insertStatement;
    private EClass selectIntoStatement;
    private EClass ifStatement;
    private EClass forLoopStatement;
    private EClass variableDeclaration;
    private EClass variableExpression;

    private EClass amnMachine;
    private EClass variable;
    private EClass operation;
    private EClass assignSubstitution;
    private EClass skipSubstitution;
    private EClass anySubstitution;
    private EClass selectSubstitution;
    private EClass ifSubstitution;
    private EClass sequentialSubstitution;
    private EClass preSubstitution;
    private EClass varRef;
    private EClass invariantPredicate;
    private EClass setDefinition;

    public SQL2AMNTransformer(ResourceSet resourceSet, Resource inputResource) {
        this.resourceSet = resourceSet;
        this.inputResource = inputResource;
        initMetaclasses();
    }

    private void initMetaclasses() {
        for (Object pkg : EPackage.Registry.INSTANCE.values()) {
            if (pkg instanceof EPackage) {
                EPackage p = (EPackage) pkg;
                if ("http://sql/1.0".equals(p.getNsURI())) sqlPackage = p;
                if ("http://amn/1.0".equals(p.getNsURI())) {
                    amnPackage = p;
                    amnFactory = p.getEFactoryInstance();
                }
            }
        }

        if (sqlPackage == null || amnPackage == null) {
            throw new RuntimeException("Не найдены пакеты sql или amn.");
        }

        sqlProgram          = (EClass) sqlPackage.getEClassifier("SQLProgram");
        procedure           = (EClass) sqlPackage.getEClassifier("Procedure");
        insertStatement     = (EClass) sqlPackage.getEClassifier("InsertStatement");
        selectIntoStatement = (EClass) sqlPackage.getEClassifier("SelectIntoStatement");
        ifStatement         = (EClass) sqlPackage.getEClassifier("IfStatement");
        forLoopStatement    = (EClass) sqlPackage.getEClassifier("ForLoopStatement");
        variableDeclaration = (EClass) sqlPackage.getEClassifier("VariableDeclaration");
        variableExpression  = (EClass) sqlPackage.getEClassifier("VariableExpression");

        amnMachine             = (EClass) amnPackage.getEClassifier("AMNMachine");
        variable               = (EClass) amnPackage.getEClassifier("Variable");
        operation              = (EClass) amnPackage.getEClassifier("Operation");
        assignSubstitution     = (EClass) amnPackage.getEClassifier("AssignSubtitution");
        skipSubstitution       = (EClass) amnPackage.getEClassifier("SkipSubtitution");
        anySubstitution        = (EClass) amnPackage.getEClassifier("AnySubtitution");
        selectSubstitution     = (EClass) amnPackage.getEClassifier("SelectSubtitution");
        ifSubstitution         = (EClass) amnPackage.getEClassifier("IfSubtitution");
        sequentialSubstitution = (EClass) amnPackage.getEClassifier("SequentialSubtitution");
        preSubstitution        = (EClass) amnPackage.getEClassifier("PreSubtitution");
        varRef                 = (EClass) amnPackage.getEClassifier("VarRef");
        invariantPredicate     = (EClass) amnPackage.getEClassifier("InvariantPredicate");
        setDefinition          = (EClass) amnPackage.getEClassifier("SetDefinition");

        System.out.println("Метаклассы инициализированы успешно.");
    }

    private EObject create(EClass cls) {
        EObject obj = amnFactory.create(cls);
        outputResource.getContents().add(obj);
        return obj;
    }

    @SuppressWarnings("unchecked")
    public Resource transform(URI outputURI) {
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        outputResource = resourceSet.createResource(outputURI);

        EObject root = inputResource.getContents().get(0);
        EObject machine = create(amnMachine);
        machine.eSet(amnMachine.getEStructuralFeature("name"), "GeneratedMachine");

        EObject stateSet = create(setDefinition);
        stateSet.eSet(setDefinition.getEStructuralFeature("name"), "QUERY_PERFORMED");
        ((List<EObject>) machine.eGet(amnMachine.getEStructuralFeature("sets"))).add(stateSet);

        EObject inv = create(invariantPredicate);
        inv.eSet(invariantPredicate.getEStructuralFeature("text"), "state : QUERY_PERFORMED");
        ((List<EObject>) machine.eGet(amnMachine.getEStructuralFeature("invariants"))).add(inv);

        List<EObject> procedures = (List<EObject>)
                root.eGet(sqlProgram.getEStructuralFeature("procedures"));

        for (EObject proc : procedures) {
            List<EObject> decls = (List<EObject>)
                    proc.eGet(procedure.getEStructuralFeature("declarations"));
            for (EObject decl : decls) {
                EObject v = transformDeclaration(decl);
                ((List<EObject>) machine.eGet(
                        amnMachine.getEStructuralFeature("variables"))).add(v);
            }

            List<EObject> body = (List<EObject>)
                    proc.eGet(procedure.getEStructuralFeature("body"));
            for (EObject stmt : body) {
                EObject op = transformStatement(stmt);
                if (op != null) {
                    ((List<EObject>) machine.eGet(
                            amnMachine.getEStructuralFeature("operations"))).add(op);
                }
            }
        }

        return outputResource;
    }

    private EObject transformDeclaration(EObject decl) {
        EObject v = create(variable);
        v.eSet(variable.getEStructuralFeature("name"),
                decl.eGet(variableDeclaration.getEStructuralFeature("name")));
        String sqlType = (String) decl.eGet(
                variableDeclaration.getEStructuralFeature("typeName"));
        v.eSet(variable.getEStructuralFeature("typeName"), mapType(sqlType));
        return v;
    }

    private EObject transformStatement(EObject stmt) {
        EClass cls = stmt.eClass();
        if (cls == insertStatement)     return transformInsert(stmt);
        if (cls == selectIntoStatement) return transformSelectInto(stmt);
        if (cls == ifStatement)         return transformIf(stmt);
        if (cls == forLoopStatement)    return transformForLoop(stmt);
        return null;
    }

    @SuppressWarnings("unchecked")
    private EObject transformInsert(EObject stmt) {
        String tableName = (String) stmt.eGet(
                insertStatement.getEStructuralFeature("tableName"));
        List<String> columns = (List<String>) stmt.eGet(
                insertStatement.getEStructuralFeature("columns"));

        EObject op = create(operation);
        op.eSet(operation.getEStructuralFeature("name"), "insert_into_" + tableName);

        EObject pre = create(preSubstitution);
        EObject guard = create(varRef);

        StringBuilder guardStr = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            guardStr.append(columns.get(i)).append(" : T");
            if (i < columns.size() - 1) guardStr.append(" & ");
        }
        guard.eSet(varRef.getEStructuralFeature("name"), guardStr.toString());
        pre.eSet(preSubstitution.getEStructuralFeature("guard"), guard);

        EObject any = create(anySubstitution);
        any.eSet(anySubstitution.getEStructuralFeature("boundVar"), "pk");

        EObject cond = create(varRef);
        cond.eSet(varRef.getEStructuralFeature("name"),
                "pk : INT & not(#(x).(x : " + tableName + " & x'id = pk))");
        any.eSet(anySubstitution.getEStructuralFeature("condition"), cond);

        EObject assign = create(assignSubstitution);
        assign.eSet(assignSubstitution.getEStructuralFeature("variable"), tableName);

        EObject val = create(varRef);
        StringBuilder rec = new StringBuilder(tableName + " \\/ {rec(");
        for (int i = 0; i < columns.size(); i++) {
            rec.append(columns.get(i));
            if (i < columns.size() - 1) rec.append(", ");
        }
        rec.append(")}");
        val.eSet(varRef.getEStructuralFeature("name"), rec.toString());
        assign.eSet(assignSubstitution.getEStructuralFeature("value"), val);

        any.eSet(anySubstitution.getEStructuralFeature("thenBody"), assign);
        pre.eSet(preSubstitution.getEStructuralFeature("body"), any);
        op.eSet(operation.getEStructuralFeature("body"), pre);
        return op;
    }

    private EObject transformSelectInto(EObject stmt) {
        String targetVar = (String) stmt.eGet(
                selectIntoStatement.getEStructuralFeature("targetVar"));
        String sourceCol = (String) stmt.eGet(
                selectIntoStatement.getEStructuralFeature("sourceColumn"));
        String fromTable = (String) stmt.eGet(
                selectIntoStatement.getEStructuralFeature("fromTable"));

        EObject op = create(operation);
        op.eSet(operation.getEStructuralFeature("name"), "select_into_" + targetVar);

        EObject any = create(anySubstitution);
        any.eSet(anySubstitution.getEStructuralFeature("boundVar"), "vv");

        EObject cond = create(varRef);
        cond.eSet(varRef.getEStructuralFeature("name"), "vv : " + fromTable);
        any.eSet(anySubstitution.getEStructuralFeature("condition"), cond);

        EObject assign = create(assignSubstitution);
        assign.eSet(assignSubstitution.getEStructuralFeature("variable"), targetVar);

        EObject val = create(varRef);
        val.eSet(varRef.getEStructuralFeature("name"), "vv'" + sourceCol);
        assign.eSet(assignSubstitution.getEStructuralFeature("value"), val);

        any.eSet(anySubstitution.getEStructuralFeature("thenBody"), assign);
        op.eSet(operation.getEStructuralFeature("body"), any);
        return op;
    }

    @SuppressWarnings("unchecked")
    private EObject transformIf(EObject stmt) {
        EObject op = create(operation);
        op.eSet(operation.getEStructuralFeature("name"), "if_operation");

        EObject ifSub = create(ifSubstitution);

        EObject condExpr = create(varRef);
        List<EObject> conditions = (List<EObject>) stmt.eGet(
                ifStatement.getEStructuralFeature("condition"));

        if (!conditions.isEmpty()) {
            EObject sqlCond = conditions.get(0);
            String condName = (String) sqlCond.eGet(
                    variableExpression.getEStructuralFeature("name"));
            if (condName != null && condName.startsWith("IS_NULL:")) {
                String varName = condName.substring("IS_NULL:".length());
                condExpr.eSet(varRef.getEStructuralFeature("name"), varName + " = {}");
            } else {
                condExpr.eSet(varRef.getEStructuralFeature("name"),
                        condName != null ? condName : "TRUE");
            }
        } else {
            condExpr.eSet(varRef.getEStructuralFeature("name"), "TRUE");
        }
        ifSub.eSet(ifSubstitution.getEStructuralFeature("condition"), condExpr);

        List<EObject> thenBranch = (List<EObject>) stmt.eGet(
                ifStatement.getEStructuralFeature("thenBranch"));
        EObject thenBody = buildSequential(thenBranch);
        ifSub.eSet(ifSubstitution.getEStructuralFeature("thenBody"), thenBody);

        EObject elseBody = create(skipSubstitution);
        ifSub.eSet(ifSubstitution.getEStructuralFeature("elseBody"), elseBody);

        op.eSet(operation.getEStructuralFeature("body"), ifSub);
        return op;
    }

    private EObject transformForLoop(EObject stmt) {
        String loopVar   = (String) stmt.eGet(
                forLoopStatement.getEStructuralFeature("loopVar"));
        String fromTable = (String) stmt.eGet(
                forLoopStatement.getEStructuralFeature("fromTable"));

        EObject op = create(operation);
        op.eSet(operation.getEStructuralFeature("name"), "loop_" + fromTable);

        EObject sel = create(selectSubstitution);
        EObject selCond = create(varRef);
        selCond.eSet(varRef.getEStructuralFeature("name"), "records_to_transform /= {}");
        sel.eSet(selectSubstitution.getEStructuralFeature("condition"), selCond);

        EObject any = create(anySubstitution);
        any.eSet(anySubstitution.getEStructuralFeature("boundVar"), "vv");

        EObject anyCond = create(varRef);
        anyCond.eSet(varRef.getEStructuralFeature("name"), "vv : records_to_transform");
        any.eSet(anySubstitution.getEStructuralFeature("condition"), anyCond);

        EObject assign = create(assignSubstitution);
        assign.eSet(assignSubstitution.getEStructuralFeature("variable"), loopVar);

        EObject val = create(varRef);
        val.eSet(varRef.getEStructuralFeature("name"), "vv");
        assign.eSet(assignSubstitution.getEStructuralFeature("value"), val);

        any.eSet(anySubstitution.getEStructuralFeature("thenBody"), assign);
        sel.eSet(selectSubstitution.getEStructuralFeature("thenBody"), any);
        op.eSet(operation.getEStructuralFeature("body"), sel);
        return op;
    }

    private EObject buildSequential(List<EObject> stmts) {
        if (stmts == null || stmts.isEmpty()) {
            return create(skipSubstitution);
        }
        if (stmts.size() == 1) {
            EObject result = transformStatement(stmts.get(0));
            return result != null ? result : create(skipSubstitution);
        }
        EObject first = transformStatement(stmts.get(0));
        if (first == null) first = create(skipSubstitution);

        EObject seq = create(sequentialSubstitution);
        seq.eSet(sequentialSubstitution.getEStructuralFeature("first"), first);
        seq.eSet(sequentialSubstitution.getEStructuralFeature("second"),
                buildSequential(stmts.subList(1, stmts.size())));
        return seq;
    }

    private String mapType(String sqlType) {
        if (sqlType == null) return "T";
        switch (sqlType.toUpperCase()) {
            case "BIGINT":  return "INT";
            case "VARCHAR": return "seq(0..255)";
            case "RECORD":  return "struct";
            default:        return sqlType;
        }
    }
}