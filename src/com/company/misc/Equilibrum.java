package com.company.misc;

import java.util.Scanner;

public class Equilibrum {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int length = in.nextInt();
            int[] values = new int[length];

            for (int i = 0; i < length; i++) {
                values[i] = in.nextInt();
            }
            System.out.println(checkForEqual(values));
        }
    }

    private static int checkForEqual(int[] values) {
        int sum = 0;
        int leftSum = 0;
        for (int value : values) {
            sum += value;
        }
        for (int i = 0; i < values.length; i++) {
            sum -= values[i];
            if (sum == leftSum) {
                return i + 1;
            } else {
                leftSum += values[i];
            }
        }
        return -1;

    }
}