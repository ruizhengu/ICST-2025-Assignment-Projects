package introclassJava;

import java.util.LinkedHashMap;
import java.util.Map;

class IntObj2 {
    public int value;

    public IntObj2() {
    }

    public IntObj2(int i) {
        value = i;
    }
}

class FloatObj2 {
    public float value;

    public FloatObj2() {
    }

    public FloatObj2(float i) {
        value = i;
    }
}

class LongObj2 {
    public long value;

    public LongObj2() {
    }

    public LongObj2(long i) {
        value = i;
    }
}

class DoubleObj2 {
    public double value;

    public DoubleObj2() {
    }

    public DoubleObj2(double i) {
        value = i;
    }
}

class CharObj2 {
    public char value;

    public CharObj2() {
    }

    public CharObj2(char i) {
        value = i;
    }
}

public class Grade2 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main(String[] args) throws Exception {
        Grade mainClass = new Grade();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner(args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner(System.in);
        }
        mainClass.exec();
        System.out.println(mainClass.output);
    }

    public void exec() throws Exception {
        Map<String, Double> gradeThresholds = new LinkedHashMap<>();
        gradeThresholds.put("A", null);
        gradeThresholds.put("B", null);
        gradeThresholds.put("C", null);
        gradeThresholds.put("D", null);

        output += ("Enter thresholds for A, B, C, D\n");
        output += ("in that order, decreasing percentages > ");

        // Read grade thresholds
        for (Map.Entry<String, Double> entry : gradeThresholds.entrySet()) {
            System.out.print("Enter threshold for grade " + entry.getKey() + ": ");
            entry.setValue(scanner.nextDouble());
        }

        output += ("Thank you. Now enter student score (percent) >");
        double score = scanner.nextDouble();

        // Determine grade
        String studentGrade = "Student has failed the course\n"; // Default grade
        for (Map.Entry<String, Double> entry : gradeThresholds.entrySet()) {
            if (score >= entry.getValue()) {
                studentGrade = "Student has an " + entry.getKey() + " grade\n";
                break;
            }
        }

        output += studentGrade;
    }
}