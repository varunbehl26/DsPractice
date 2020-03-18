package com.company.interviewbit.arrays;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 5, 3};

        int max_sum = duplicate(A);
        System.out.println("Duplicate is " + max_sum);
    }

    private static int duplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                return i;
            }
            map.put(i, 1);
        }
        return -1;
    }


}
