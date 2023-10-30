package org.example;

public class Calc {
    public static int run(String in) {
        // System.out.println("in = " + in);

        if (in.contains("(")) {
            // System.out.println(in.indexOf("(") + 1 + "       " + in.lastIndexOf(")"));
            int runResult = Calc.run(in.substring(in.indexOf("(") + 1, in.lastIndexOf(")")));
            // System.out.println("runResult = " + runResult);

            in = in.replace(in.substring(in.indexOf("("), in.lastIndexOf(")") + 1), String.valueOf(runResult));
            // System.out.println("runResult = " + runResult);
            // System.out.println("in = " + in);
        }

        String replace = in.replace(" ", ",");
        String[] ins = replace.split(",");

        int num1 = Integer.parseInt(ins[0]);
        int num2 = Integer.parseInt(ins[2]);

        if (ins[1].equals("+")) {
            return num1 + num2;
        }

        if (ins[1].equals("-")) {
            return num1 - num2;
        }

        if (ins[1].equals("*")) {
            return num1 * num2;
        }

        if (ins[1].equals("/")) {
            return num1 / num2;
        }

        return 0;

    }
}
