package SQL2AMN.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * AMNSerializer — читает example_amn.xmi и генерирует example.mch
 * в текстовом формате языка AMN для загрузки в Atelier B.
 */
public class AMNSerializer {

    public static void main(String[] args) throws IOException {

        String ecoreFile  = "D:\\eclipse-workspace\\sql2amn\\model\\SQL2AMN.ecore";
        String amnXmiFile = "D:\\eclipse-workspace\\sql2amn\\example_amn.xmi";
        String mchFile    = "D:\\eclipse-workspace\\sql2amn\\example.mch";

        // 1. Настраиваем ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi",   new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("ecore", new EcoreResourceFactoryImpl());

        // 2. Загружаем метамодель
        Resource ecoreResource = resourceSet.getResource(
                URI.createFileURI(ecoreFile), true);
        ecoreResource.load(null);

        for (EObject obj : ecoreResource.getContents()) {
            if (obj instanceof EPackage) {
                registerPackages((EPackage) obj, resourceSet);
            }
        }

        // 3. Загружаем AMN XMI модель
        Resource amnResource = resourceSet.getResource(
                URI.createFileURI(amnXmiFile), true);
        amnResource.load(null);

        System.out.println("AMN модель загружена: " + amnXmiFile);

        // 4. Генерируем .mch файл
        AMNSerializer serializer = new AMNSerializer();
        serializer.serialize(amnResource, mchFile);

        System.out.println("MCH файл сгенерирован: " + mchFile);
    }

    private static void registerPackages(EPackage pkg, ResourceSet resourceSet) {
        EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
        resourceSet.getPackageRegistry().put(pkg.getNsURI(), pkg);
        for (EPackage sub : pkg.getESubpackages()) {
            registerPackages(sub, resourceSet);
        }
    }

    /**
     * Основной метод сериализации — обходит модель и генерирует текст AMN.
     */
    @SuppressWarnings("unchecked")
    public void serialize(Resource resource, String outputPath) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        // Находим корневой объект AMNMachine
        EObject machine = null;
        for (EObject obj : resource.getContents()) {
            if (obj.eClass().getName().equals("AMNMachine")) {
                machine = obj;
                break;
            }
        }

        if (machine == null) {
            System.out.println("AMNMachine не найдена в модели!");
            writer.close();
            return;
        }

        String machineName = (String) machine.eGet(
                machine.eClass().getEStructuralFeature("name"));

        // Заголовок машины
        writer.println("MACHINE");
        writer.println("    " + machineName);
        writer.println();

        // SETS
        List<EObject> sets = (List<EObject>) machine.eGet(
                machine.eClass().getEStructuralFeature("sets"));
        if (!sets.isEmpty()) {
            writer.println("SETS");
            StringBuilder setsLine = new StringBuilder("    ");
            for (int i = 0; i < sets.size(); i++) {
                EObject set = sets.get(i);
                setsLine.append(get(set, "name"));
                if (i < sets.size() - 1) setsLine.append("; ");
            }
            writer.println(setsLine.toString());
            writer.println();
        }

        // VARIABLES
        List<EObject> variables = (List<EObject>) machine.eGet(
                machine.eClass().getEStructuralFeature("variables"));
        if (!variables.isEmpty()) {
            writer.println("ABSTRACT_VARIABLES");
            StringBuilder varLine = new StringBuilder("    ");
            for (int i = 0; i < variables.size(); i++) {
                varLine.append(get(variables.get(i), "name"));
                if (i < variables.size() - 1) varLine.append(", ");
            }
            writer.println(varLine.toString());
            writer.println();
        }

        // INVARIANT
        List<EObject> invariants = (List<EObject>) machine.eGet(
                machine.eClass().getEStructuralFeature("invariants"));
        if (!invariants.isEmpty()) {
            writer.println("INVARIANT");
            for (int i = 0; i < invariants.size(); i++) {
                EObject inv = invariants.get(i);
                String text = (String) inv.eGet(
                        inv.eClass().getEStructuralFeature("text"));

                // Добавляем типизацию переменных
                if (i == 0) {
                    writer.print("    " + text);
                    for (EObject v : variables) {
                        String vName = get(v, "name");
                        String vType = get(v, "typeName");
                        writer.println(" &");
                        writer.print("    " + vName + " : " + vType);
                    }
                    writer.println();
                }
            }
            writer.println();
        }

        // INITIALISATION
        writer.println("INITIALISATION");
        if (!variables.isEmpty()) {
            for (int i = 0; i < variables.size(); i++) {
                EObject v = variables.get(i);
                String vName = get(v, "name");
                String vType = get(v, "typeName");
                if (i == 0) {
                    writer.print("    ");
                } else {
                    writer.print(" ||\n    ");
                }
                if ("INT".equals(vType)) {
                    writer.print(vName + " := 0");
                } else if (vType.startsWith("seq")) {
                    writer.print(vName + " := []");
                } else {
                    writer.print("ANY vv WHERE vv : " + vType +
                            "_struct THEN " + vName + " := vv END");
                }
            }
            writer.println();
        } else {
            writer.println("    skip");
        }
        writer.println();

        // OPERATIONS
        List<EObject> operations = (List<EObject>) machine.eGet(
                machine.eClass().getEStructuralFeature("operations"));
        if (!operations.isEmpty()) {
            writer.println("OPERATIONS");
            writer.println();
            for (EObject op : operations) {
                String opName = get(op, "name");
                writer.println("    " + opName + " =");
                EObject body = (EObject) op.eGet(
                        op.eClass().getEStructuralFeature("body"));
                if (body != null) {
                    writer.println(serializeSubstitution(body, "    "));
                } else {
                    writer.println("        skip");
                }
                writer.println("    ;");
                writer.println();
            }
        }

        writer.println("END");
        writer.close();
    }

    /**
     * Рекурсивно сериализует подстановку в текст AMN.
     */
    private String serializeSubstitution(EObject subst, String indent) {
        if (subst == null) return indent + "    skip";

        String className = subst.eClass().getName();

        switch (className) {

            case "SkipSubtitution":
                return indent + "    skip";

            case "AssignSubtitution": {
                String variable = get(subst, "variable");
                EObject value = getRef(subst, "value");
                String valStr = value != null ? get(value, "name") : "undefined";
                return indent + "    " + variable + " := " + valStr;
            }

            case "AnySubtitution": {
                String boundVar = get(subst, "boundVar");
                EObject cond    = getRef(subst, "condition");
                EObject then    = getRef(subst, "thenBody");
                String condStr  = cond != null ? get(cond, "name") : "TRUE";
                String thenStr  = serializeSubstitution(then, indent + "    ");
                return indent + "    ANY " + boundVar + " WHERE " + condStr + " THEN\n"
                        + thenStr + "\n"
                        + indent + "    END";
            }

            case "SelectSubtitution": {
                EObject cond   = getRef(subst, "condition");
                EObject then   = getRef(subst, "thenBody");
                String condStr = cond != null ? get(cond, "name") : "TRUE";
                String thenStr = serializeSubstitution(then, indent + "    ");
                return indent + "    SELECT " + condStr + " THEN\n"
                        + thenStr + "\n"
                        + indent + "    END";
            }

            case "IfSubtitution": {
                EObject cond  = getRef(subst, "condition");
                EObject then  = getRef(subst, "thenBody");
                EObject else_ = getRef(subst, "elseBody");
                String condStr = cond != null ? get(cond, "name") : "TRUE";
                String thenStr = serializeSubstitution(then, indent + "    ");
                String result = indent + "    IF " + condStr + " THEN\n" + thenStr;
                if (else_ != null && !else_.eClass().getName().equals("SkipSubtitution")) {
                    result += "\n" + indent + "    ELSE\n"
                            + serializeSubstitution(else_, indent + "    ");
                }
                result += "\n" + indent + "    END";
                return result;
            }

            case "PreSubtitution": {
                EObject guard = getRef(subst, "guard");
                EObject body  = getRef(subst, "body");
                String guardStr = guard != null ? get(guard, "name") : "TRUE";
                String bodyStr  = serializeSubstitution(body, indent + "    ");
                return indent + "    PRE " + guardStr + " THEN\n"
                        + bodyStr + "\n"
                        + indent + "    END";
            }

            case "SequentialSubtitution": {
                EObject first  = getRef(subst, "first");
                EObject second = getRef(subst, "second");
                return serializeSubstitution(first, indent) + " ;\n"
                        + serializeSubstitution(second, indent);
            }

            default:
                return indent + "    skip /* неизвестная подстановка: " + className + " */";
        }
    }

    // Вспомогательный метод — получить строковый атрибут
    private String get(EObject obj, String feature) {
        if (obj == null) return "";
        Object val = obj.eGet(obj.eClass().getEStructuralFeature(feature));
        return val != null ? val.toString() : "";
    }

    // Вспомогательный метод — получить ссылку на другой объект
    private EObject getRef(EObject obj, String feature) {
        if (obj == null) return null;
        Object val = obj.eGet(obj.eClass().getEStructuralFeature(feature));
        if (val instanceof EObject) return (EObject) val;
        if (val instanceof List && !((List<?>) val).isEmpty()) {
            Object first = ((List<?>) val).get(0);
            if (first instanceof EObject) return (EObject) first;
        }
        return null;
    }
}