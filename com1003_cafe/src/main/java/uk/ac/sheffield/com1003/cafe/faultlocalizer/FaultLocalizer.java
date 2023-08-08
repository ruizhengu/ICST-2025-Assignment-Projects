package uk.ac.sheffield.com1003.cafe.faultlocalizer;

import com.gzoltar.core.GZoltar;
import com.gzoltar.core.instr.testing.TestResult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class FaultLocalizer {

    Set<String> binJavaClasses = new HashSet<String>();
    Set<String> binExecuteTestClasses = new HashSet<String>();
    String binJavaDir;
    String binTestDir;
    String srcDir;
    Set<String> dependencies = new HashSet<String>();
    Set<String> positiveTestMethods;
    Set<String> negativeTestMethods;

    public FaultLocalizer() throws IOException {
        srcDir = "/home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe";
        binJavaDir = "/home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe/src/main";
        binTestDir = "/home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe/src/test";
        getClasses();

        dependencies.add("/home/ruizhen/Projects/SSBSE/Cafe/dependency/javaparser-core-3.24.4.jar");
        dependencies.add("/home/ruizhen/Projects/SSBSE/Cafe/dependency/javaparser-core-serialization-3.24.4.jar");
        dependencies.add("/home/ruizhen/Projects/SSBSE/Cafe/dependency/commons-lang3-3.0.jar");

        positiveTestMethods = new HashSet<String>();
        negativeTestMethods = new HashSet<String>();

        System.out.println(binJavaClasses);
        System.out.println(binExecuteTestClasses);
    }

    public void getClasses() throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("/home/ruizhen/Projects/APR-as-AAT/com1003_cafe/src/main/java/uk/ac/sheffield/com1003/cafe/faultlocalizer/classes.json")), StandardCharsets.UTF_8);
        JSONObject o = new JSONObject(text);
        JSONArray javaClassesArray = o.getJSONArray("binJavaClasses");
        for (Object javaClass : javaClassesArray) {
            binJavaClasses.add((String) javaClass);
        }
        JSONArray testClassesArray = o.getJSONArray("binExecuteTestClasses");
        for (Object testClass : testClassesArray) {
            binExecuteTestClasses.add((String) testClass);
        }
    }


    public void getFaults() throws IOException {
        GZoltar gz = new GZoltar(srcDir);
        gz.getClasspaths().add(binJavaDir);
        gz.getClasspaths().add(binTestDir);
        gz.getClasspaths().addAll(dependencies);

        for (String testClass : binExecuteTestClasses)
            gz.addTestToExecute(testClass);

        for (String javaClass : binJavaClasses)
            gz.addClassToInstrument(javaClass);

        gz.run();

        for (TestResult tr : gz.getTestResults()) {
            String testName = tr.getName();
            if (tr.wasSuccessful())
                positiveTestMethods.add(testName);
            else {
                if (!tr.getName().startsWith("junit.framework"))
                    negativeTestMethods.add(testName);
            }
        }

        System.out.println("positiveTestMethods " + positiveTestMethods.size());
        System.out.println("negativeTestMethods " + negativeTestMethods.size());
    }


    public static void main(String[] args) throws IOException {
        FaultLocalizer fl = new FaultLocalizer();
        fl.getFaults();
    }
}
