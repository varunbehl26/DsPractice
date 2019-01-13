package com.company.strings;

import java.util.Scanner;

//https://www.youtube.com/watch?v=nbTSfrEfo6M
public class LONGESTPALINDROME {
    private static String result = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String val = in.next();
            palindrome(val);
            if (tests > 1) {
                System.out.println();
            }
        }
    }

    private static void palindrome(String val) {

        char[] values = val.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < values.length; i++) {

            for (int j = i; j < values.length + 1; j++) {

                String substring = val.substring(i, j);

                StringBuilder stringBuilder = new StringBuilder(substring);

                stringBuilder.reverse();


                if (substring.equals(stringBuilder.toString())) {
                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        result = substring;
                    }
                }

            }
        }
        System.out.println(result);
    }


}
