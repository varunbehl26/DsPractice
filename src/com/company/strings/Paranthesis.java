package com.company.strings;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String val = in.next();
            System.out.println(checkForParentheisis(val.split("")) ? "balanced" : "not balanced");
        }
    }

    private static boolean checkForParentheisis(String[] values) {
        Stack<String> stack = new Stack();

        for (String s : values) {
            if (s.equals("{") || s.equals("(") || s.equals("[")) {
                stack.push(s);
            }
            if (s.equals("}") || s.equals(")") || s.equals("]")) {

                if (stack.isEmpty()) {
                    return false;
                } else if (!isMathing(stack.pop(), s)) {
                    return false;
                }

            }
        }
        /*balanced*//*not balanced*/
        return stack.isEmpty();
    }

    private static boolean isMathing(String Stringacter1, String Stringacter2) {
        if (Stringacter1.equals("(") && Stringacter2.equals(")"))
            return true;
        else if (Stringacter1.equals("{") && Stringacter2.equals("}"))
            return true;
        else return Stringacter1.equals("[") && Stringacter2.equals("]");
    }
}