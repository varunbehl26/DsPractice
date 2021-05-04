package com.company.arrays.easy;

import java.util.HashMap;

//1748. Sum of Unique Elements
public class SumOfUnique {

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 1) {
                sum += num;
            } else if (map.get(num) == 2) {
                sum -= num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(sumOfUnique(nums));
    }
}
