package com.company.strings;

import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String val = in.next();
            String secondString = in.next();
            System.out.println(firstOccurrence(val, secondString));
            if (tests > 1) {
                System.out.println();
            }
        }
    }

    private static int firstOccurrence(String firstString, String secondString) {
        return firstString.indexOf(secondString);


    }
}
