package com.company.strings.todiscus;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String val = in.next();
            String[] values = val.split("");
            Arrays.sort(values);
            StringBuilder builder = new StringBuilder();
            for (String s : values
            ) {
                builder.append(s);
            }
            perm1(builder.toString());
            System.out.println();
        }
    }

    private static void perm1(String s) {
        perm1("", s);
    }

    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.print(prefix + " ");
        else {
            for (int i = 0; i < n; i++)
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
        }

    }

}
