package com.company.arrays.medium;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/find-all-duplicates-in-an-array/
/*
    Simple logic of setting a negative number at its index,
    Loop again, if value at the index is negative than it duplicate

 */

public class FindDuplicate {


    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateList = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            //index is 1 less than the number as array index starts from 0
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                duplicateList.add(Math.abs(index + 1));
            }

            nums[index] = -nums[index];
        }

        return duplicateList;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDuplicates(nums);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
