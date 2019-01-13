package com.company.strings.todo;

import java.util.Scanner;

public class LongestCommonString {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
//            int len1 = in.nextInt();
//            int len2 = in.nextInt();

            String actualString = in.next();
            String anagramCheckString = in.next();

            check(actualString, anagramCheckString);
        }
    }

    private static void check(String actualString, String anagramCheckString) {

    }
}