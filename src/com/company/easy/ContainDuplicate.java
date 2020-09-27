package com.company.easy;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/

import java.util.HashMap;

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return false;

        HashMap map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(containsDuplicate(arr));
    }

}
