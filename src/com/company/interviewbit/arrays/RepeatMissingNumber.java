package com.company.interviewbit.arrays;

import java.util.HashMap;
import java.util.Map;
//https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
public class RepeatMissingNumber {
    public static int[] repeatedNumber(final int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int repeated = 0;

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if (map.get(A[i]) == 2) {
                repeated = A[i];
                A[i] = 0;
            }
        }

        //Sum till numbers
        long sum = (A.length * (A.length + 1)) / 2;
        long sumTillNow = 0;
        for (int value : A) {
            sumTillNow += value;
        }
        long absent = (sum - sumTillNow);
        return new int[]{repeated, (int) absent};
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 5, 3};
        int[] repeatedAndMissing = repeatedNumber(A);

        for (int i : repeatedAndMissing) {
            System.out.println(i);
        }
    }
}
