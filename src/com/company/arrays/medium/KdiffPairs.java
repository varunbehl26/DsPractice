package com.company.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {

    /*
        https://leetcode.com/problems/k-diff-pairs-in-an-array/

        Pairs need to be found, whose difference is given
        Best way is to keep all numbers in hashmap & then start finding the key + K,
        if it exists we have found the pair

     */
    public static int findPairs(int[] nums, int k) {
        if (nums.length != 0) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int count = 0;

            for (int integer : map.keySet()) {
                int key = integer + k;
                int freq = map.getOrDefault(key, 0);
                if (k == 0 && freq >= 2) {
                    count++;
                    map.put(integer, freq - 1);
                } else if (k > 0 && freq != 0) {
                    count++;
                    map.put(key, freq - 1);
                }
            }
            return count;
        }
        return 0;
    }


    public static void main(String[] args) {

        int[] nums = {3, 1, 4, 1, 5};
        System.out.println(findPairs(nums, 2));
    }
}
