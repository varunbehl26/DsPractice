package com.company;/*package whatever //do not write package name here */

import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int length = in.nextInt();
            int zeroes = 0, ones = 0, two = 0;
            for (int i = 0; i < length; i++) {
                int temp = in.nextInt();
                if (temp == 0) {
                    zeroes++;
                } else if (temp == 1) {
                    ones++;
                } else {
                    two++;
                }
            }
            for (int i = 0; i < zeroes; i++) {
                System.out.print("0");
                if (i < zeroes - 1) {
                    System.out.print(" ");
                }
            }
            for (int i = 0; i < ones; i++) {
                System.out.print("1");
                if (i < ones - 1) {
                    System.out.print(" ");
                }
            }
            for (int i = 0; i < two; i++) {
                System.out.print("2");
                if (i < two - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}