package SQL2AMN.parser;
 
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
 
import sQL2AMN.sql.SqlFactory;
import sQL2AMN.sql.SqlPackage;
import sQL2AMN.sql.SQLProgram;
import sQL2AMN.sql.Procedure;
import sQL2AMN.sql.Statement;
import sQL2AMN.sql.CreateTableStatement;
import sQL2AMN.sql.InsertStatement;
import sQL2AMN.sql.SelectIntoStatement;
import sQL2AMN.sql.IfStatement;
import sQL2AMN.sql.ForLoopStatement;
import sQL2AMN.sql.VariableDeclaration;
import sQL2AMN.sql.Expression;
import sQL2AMN.sql.LiteralExpression;
import sQL2AMN.sql.VariableExpression;
import sQL2AMN.sql.FieldAcessExpression;
 
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
 
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
 

public class SQLModelBuilder extends PlPgSQLBaseListener {
 
    private final SqlFactory factory = SqlFactory.eINSTANCE;
 
    private SQLProgram program;
 
    private Procedure currentProcedure;

    private final Deque<java.util.List<Statement>> statementStack = new ArrayDeque<>();

    @Override
    public void enterProgram(PlPgSQLParser.ProgramContext ctx) {
        program = factory.createSQLProgram();
    }

    @Override
    public void enterCreateTableStatement(
            PlPgSQLParser.CreateTableStatementContext ctx) {
 
        CreateTableStatement stmt = factory.createCreateTableStatement();
 
        stmt.setTableName(ctx.tableName().getText());
 
        addStatement(stmt);
    }

    @Override
    public void enterCreateFunctionStatement(
            PlPgSQLParser.CreateFunctionStatementContext ctx) {
 
        currentProcedure = factory.createProcedure();
        currentProcedure.setName(ctx.functionName().getText());
        program.getProcedures().add(currentProcedure);
 
        statementStack.push(currentProcedure.getBody());
    }
 
    @Override
    public void exitCreateFunctionStatement(
            PlPgSQLParser.CreateFunctionStatementContext ctx) {	
        statementStack.pop();
    }

    @Override
    public void enterVariableDeclaration(
            PlPgSQLParser.VariableDeclarationContext ctx) {
 
        VariableDeclaration decl = factory.createVariableDeclaration();
        decl.setName(ctx.IDENTIFIER().getText());
        decl.setTypeName(ctx.dataType().getText());
 
        if (currentProcedure != null) {
            currentProcedure.getDeclarations().add(decl);
        }
    }

    @Override
    public void enterForLoopStatement(
            PlPgSQLParser.ForLoopStatementContext ctx) {
 
        ForLoopStatement stmt = factory.createForLoopStatement();
        stmt.setLoopVar(ctx.IDENTIFIER().getText());
        stmt.setFromTable(ctx.tableName().getText());
 
        addStatement(stmt);
 
        statementStack.push(stmt.getBody());
    }
 
    @Override
    public void exitForLoopStatement(
            PlPgSQLParser.ForLoopStatementContext ctx) {
        statementStack.pop();
    }

    @Override
    public void enterIfStatement(PlPgSQLParser.IfStatementContext ctx) {
 
        IfStatement stmt = factory.createIfStatement();
 
        if (ctx.condition() != null) {
            Expression cond = buildExpression(ctx.condition());
            stmt.setCondition(cond);
        }
 
        addStatement(stmt);
 
        statementStack.push(stmt.getThenBranch());
    }
 
    @Override
    public void exitIfStatement(PlPgSQLParser.IfStatementContext ctx) {
        statementStack.pop();
    }

    @Override
    public void enterInsertStatement(
            PlPgSQLParser.InsertStatementContext ctx) {
 
        InsertStatement stmt = factory.createInsertStatement();
        stmt.setTableName(ctx.tableName().getText());
 
        for (TerminalNode col : ctx.IDENTIFIER()) {
            stmt.getColumns().add(col.getText());
        }
 
        addStatement(stmt);
    }
 
    @Override
    public void enterSelectIntoStatement(
            PlPgSQLParser.SelectIntoStatementContext ctx) {
 
        SelectIntoStatement stmt = factory.createSelectIntoStatement();

        java.util.List<TerminalNode> ids = ctx.IDENTIFIER();
        if (ids.size() >= 2) {
            stmt.setSourceColumn(ids.get(0).getText()); // col
            stmt.setTargetVar(ids.get(1).getText());    // var
        }
        stmt.setFromTable(ctx.tableName().getText());
 
        addStatement(stmt);
    }

    private void addStatement(Statement stmt) {
        if (!statementStack.isEmpty()) {
            statementStack.peek().add(stmt);
        }
    }
 
    private Expression buildExpression(PlPgSQLParser.ConditionContext ctx) {
 
    	if (ctx instanceof PlPgSQLParser.IsNullConditionContext) {
    	    PlPgSQLParser.IsNullConditionContext nullCtx =
    	            (PlPgSQLParser.IsNullConditionContext) ctx;
    	    VariableExpression ve = factory.createVariableExpression();
    	    ve.setName("IS_NULL:" + nullCtx.expression().getText());
    	    return ve;
    	}
 
        if (ctx instanceof PlPgSQLParser.EqConditionContext) {
            PlPgSQLParser.EqConditionContext eqCtx =
                    (PlPgSQLParser.EqConditionContext) ctx;

            return buildExpressionFromExpr(eqCtx.expression(0));
        }
 

        if (ctx instanceof PlPgSQLParser.AndConditionContext) {
            PlPgSQLParser.AndConditionContext andCtx =
                    (PlPgSQLParser.AndConditionContext) ctx;
            return buildExpressionFromExpr(andCtx.expression(0));
        }
 
        VariableExpression fallback = factory.createVariableExpression();
        fallback.setName("unknown");
        return fallback;
    }
 
    private Expression buildExpressionFromExpr(
            PlPgSQLParser.ExpressionContext ctx) {
 
        if (ctx instanceof PlPgSQLParser.FieldAccessContext) {
            PlPgSQLParser.FieldAccessContext faCtx =
                    (PlPgSQLParser.FieldAccessContext) ctx;
            FieldAcessExpression fa = factory.createFieldAcessExpression();
            fa.setObjectName(faCtx.IDENTIFIER(0).getText());
            fa.setFieldName(faCtx.IDENTIFIER(1).getText());
            return fa;
        }
 
        if (ctx instanceof PlPgSQLParser.VarRefContext) {
            PlPgSQLParser.VarRefContext vrCtx =
                    (PlPgSQLParser.VarRefContext) ctx;
            VariableExpression ve = factory.createVariableExpression();
            ve.setName(vrCtx.IDENTIFIER().getText());
            return ve;
        }
 
        if (ctx instanceof PlPgSQLParser.LiteralContext) {
            PlPgSQLParser.LiteralContext litCtx =
                    (PlPgSQLParser.LiteralContext) ctx;
            LiteralExpression le = factory.createLiteralExpression();
            le.setValue(litCtx.STRING_LITERAL().getText());
            return le;
        }
 
        if (ctx instanceof PlPgSQLParser.IntLiteralContext) {
            PlPgSQLParser.IntLiteralContext intCtx =
                    (PlPgSQLParser.IntLiteralContext) ctx;
            LiteralExpression le = factory.createLiteralExpression();
            le.setValue(intCtx.INTEGER_LITERAL().getText());
            return le;
        }
 
        VariableExpression fallback = factory.createVariableExpression();
        fallback.setName("unknown");
        return fallback;
    }

    public static void parse(String sqlFilePath, String xmiFilePath)
            throws IOException {
 
        CharStream input = CharStreams.fromFileName(sqlFilePath);
 
        PlPgSQLLexer lexer = new PlPgSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
 
        PlPgSQLParser parser = new PlPgSQLParser(tokens);
        ParseTree tree = parser.program();
 
        SQLModelBuilder builder = new SQLModelBuilder();
        ParseTreeWalker.DEFAULT.walk(builder, tree);
 
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getPackageRegistry()
                .put(SqlPackage.eNS_URI, SqlPackage.eINSTANCE);
 
        URI uri = URI.createFileURI(xmiFilePath);
        Resource resource = resourceSet.createResource(uri);
        resource.getContents().add(builder.program);
        resource.save(null);
 
        System.out.println("Модель сохранена: " + xmiFilePath);
    }

    public static void main(String[] args) throws IOException {
    	String sqlFile = "D:\\eclipse-workspace\\sql2amn\\example.sql";
    	String xmiFile = "D:\\eclipse-workspace\\sql2amn\\example.xmi";
        parse(sqlFile, xmiFile);
    }
}