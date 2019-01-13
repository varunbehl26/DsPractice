package com.company.strings;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStrings {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String val = in.next();
            reverse(val);
        }
    }

    private static void reverse(String val) {
        String[] values = val.split("\\.");
        Stack stack = new Stack();
        for (String s : values
        ) {
            stack.push(s);
        }

        while (stack.size() > 1) {
            System.out.print(stack.pop() + ".");
        }
        System.out.println(stack.pop());
    }
}
