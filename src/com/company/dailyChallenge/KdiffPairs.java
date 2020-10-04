package com.company.dailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {

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

        int[] nums = {1, 3, 1, 5, 4, 5, 5};
        System.out.println(findPairs(nums, 0));
    }
}
