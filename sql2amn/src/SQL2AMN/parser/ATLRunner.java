package SQL2AMN.parser;
 
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class ATLRunner {
 
    public static void main(String[] args) throws IOException {

        String ecoreFile  = "D:\\eclipse-workspace\\sql2amn\\model\\SQL2AMN.ecore";
        String inputFile  = "D:\\eclipse-workspace\\sql2amn\\example.xmi";
        String outputFile = "D:\\eclipse-workspace\\sql2amn\\example_amn.xmi";

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi",   new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("ecore", new EcoreResourceFactoryImpl());

        Resource ecoreResource = resourceSet.getResource(
                URI.createFileURI(ecoreFile), true);
        ecoreResource.load(null);

        for (org.eclipse.emf.ecore.EObject obj : ecoreResource.getContents()) {
            if (obj instanceof org.eclipse.emf.ecore.EPackage) {
                org.eclipse.emf.ecore.EPackage pkg =
                        (org.eclipse.emf.ecore.EPackage) obj;
                registerPackages(pkg, resourceSet);
            }
        }
        
        Resource inputResource = resourceSet.getResource(
                URI.createFileURI(inputFile), true);
        inputResource.load(null);
 
        System.out.println("Входная модель загружена: " + inputFile);
        System.out.println("Содержимое: " + inputResource.getContents());

        SQL2AMNTransformer transformer = new SQL2AMNTransformer(
                resourceSet, inputResource);
        Resource outputResource = transformer.transform(
                URI.createFileURI(outputFile));

        Map<String, Object> saveOptions = new HashMap<>();
        saveOptions.put(
                org.eclipse.emf.ecore.xmi.XMIResource.OPTION_SCHEMA_LOCATION,
                Boolean.TRUE);
        org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(outputResource);
        outputResource.save(saveOptions);
 
        System.out.println("AMN-модель сохранена: " + outputFile);
    }
 
    private static void registerPackages(
            org.eclipse.emf.ecore.EPackage pkg,
            ResourceSet resourceSet) {
 
        EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
        resourceSet.getPackageRegistry().put(pkg.getNsURI(), pkg);
        System.out.println("Зарегистрирован пакет: " + pkg.getNsURI());
 
        for (org.eclipse.emf.ecore.EPackage sub : pkg.getESubpackages()) {
            registerPackages(sub, resourceSet);
        }
    }
}