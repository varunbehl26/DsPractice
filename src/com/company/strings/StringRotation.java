package com.company.strings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String actualString = in.next();
            String toBbeVerifiedString = in.next();
            System.out.println(check(actualString, toBbeVerifiedString));
        }
    }

    private static int check(String actualString, String toBbeVerifiedString) {

        if (actualString.charAt(0) == toBbeVerifiedString.charAt(toBbeVerifiedString.length() - 2) &&
                actualString.charAt(1) == toBbeVerifiedString.charAt(toBbeVerifiedString.length() - 1)
                ||
                toBbeVerifiedString.charAt(0) == actualString.charAt(toBbeVerifiedString.length() - 2) &&
                        toBbeVerifiedString.charAt(1) == actualString.charAt(toBbeVerifiedString.length() - 1)
        ) {
            return 1;
        } else {
            return 0;
        }

    }
}
