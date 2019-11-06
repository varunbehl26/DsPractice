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
        for (int value : a) {
            hashMap.put(value, 1);

            if (hashMap.containsKey(sum - value)) {
                System.out.println("key found " + value + " " + (sum - value) + "");
                break;
            }
        }
    }
}
