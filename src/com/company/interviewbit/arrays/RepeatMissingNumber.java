package com.company.interviewbit.arrays;


import java.util.HashMap;
import java.util.Map;

//
public class RepeatMissingNumber {
    public static int[] repeatedNumber(final int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int repeated = 0;
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 0);
            }
            map.put(A[i], map.get(A[i]) + 1);
            if (map.get(A[i]) == 2) {
                A[i] = 0;
            }
        }


        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == 2) {
                repeated = entrySet.getKey();
            }
        }

        long sum = (A.length * (A.length + 1)) / 2;
        long sumTillNow = 0;
        for (int i = 0; i < A.length; i++) {
            sumTillNow += A[i];
        }
        long absent = (sum - sumTillNow);
        int[] result = {repeated, (int) absent};
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 5, 3};
        repeatedNumber(A);

    }
}
