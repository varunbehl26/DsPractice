package com.company.todiscuss;

//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0

import java.util.Arrays;
import java.util.Scanner;

public class ChocklateDistribution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int length = in.nextInt();
            int[] values = new int[length];
            for (int i = 0; i < length; i++) {
                values[i] = in.nextInt();
            }

            checkArray(values);

        }
    }

    private static void checkArray(int[] values) {
        Arrays.sort(values);

        int leftIndex = 0;
        int rightIndex = values.length - 1;


    }
}