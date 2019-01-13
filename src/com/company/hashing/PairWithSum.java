package com.company.hashing;

import java.util.HashMap;

public class PairWithSum {

    public static void main(String[] args) {

        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 16;
        // Function calling
        printPairs(A, sum);

    }

    private static void printPairs(int[] a, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hashMap.put(a[i], 1);

            if (hashMap.containsKey(sum - a[i])) {
                System.out.println("key found " + a[i] + " " + (sum - a[i]) + "");
                break;
            }
        }
    }
}
