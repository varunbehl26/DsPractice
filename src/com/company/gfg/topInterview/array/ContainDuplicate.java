package com.company.gfg.topInterview.array;

import java.util.HashMap;
import java.util.Set;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> values = map.keySet();

        for (int value : values) {
            if (map.get(value) > 1) {
                return true;
            }
        }
        return false;
    }
}
