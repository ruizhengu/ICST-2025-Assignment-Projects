package us.msu.cse.repair;

import jmetal.util.JMException;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) throws Exception {
        args = new String[9];
        args[0] = "ArjaE";
        args[1] = "-DsrcJavaDir";
//		args[2] = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/cafe_java_8/src";
        args[2] = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/Java_8/cafe_2/src";
        args[3] = "-DbinJavaDir";
//		args[4] = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/cafe_java_8/build/classes/java/main";
        args[4] = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/Java_8/cafe_2/build/classes/java/main";
        args[5] = "-DbinTestDir";
//		args[6] = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/cafe_java_8/build/classes/java/test";
        args[6] = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/Java_8/cafe_2/build/classes/java/test";
        args[7] = "-Ddependences";

        String dependencies = "../dependency";
        String classpath = Files.walk(Paths.get(dependencies))
                .filter(Files::isRegularFile)
                .filter(path -> !path.getFileName().toString().equals(".DS_Store"))
                .map(path -> path.toAbsolutePath().toString())
                .collect(Collectors.joining(":"));

        args[8] = classpath;

        if (args[0].equalsIgnoreCase("ArjaE"))
            ArjaEMain.main(args);
        else if (args[0].equalsIgnoreCase("Arja"))
            ArjaMain.main(args);
        else if (args[0].equalsIgnoreCase("GenProg"))
            GenProgMain.main(args);
        else if (args[0].equalsIgnoreCase("RSRepair"))
            RSRepairMain.main(args);
        else if (args[0].equalsIgnoreCase("Kali"))
            KaliMain.main(args);
        else if (args[0].equalsIgnoreCase("-listParameters"))
            ParameterInfoMain.main(args);
        else {
            throw new JMException("The repair apporach " + args[0] + " does not exist!");
        }
    }
}