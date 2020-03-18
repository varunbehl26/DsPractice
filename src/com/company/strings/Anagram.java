package com.company.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String actualString = in.next();
            String anagramCheckString = in.next();

            check(actualString.toCharArray(), anagramCheckString.toCharArray());
        }
    }

    private static void check(char[] actualString, char[] anagramCheckString) {
        if (actualString.length != anagramCheckString.length) {
            System.out.println("NO");
            return;
        }

        Arrays.sort(actualString);
        Arrays.sort(anagramCheckString);


        for (int i = 0; i < actualString.length; i++) {
            if (actualString[i] != anagramCheckString[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}