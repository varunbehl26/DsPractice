package com.company.misc;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/trapping-rain-water/0
public class TapWater {
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

            System.out.println(checkArray(values));

        }
    }

    private static int checkArray(int[] arr) {
        int n = arr.length;
        // Initialize result
        int water = 0;


        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int[] left = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int[] right = new int[n];


        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;

    }
}
