package com.company.interviewbit.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] values = twoSum(nums, 6);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        HashMap map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && ((int) map.get(target - nums[i])) != i) {
                values.add(i);
                values.add((int) map.get(target - nums[i]));
                break;
            }
        }
        int[] result = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result[i] = values.get(i);
        }
        return result;
    }
}