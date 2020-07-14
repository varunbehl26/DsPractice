package com.company.gfg.must.easy;


//Given an array nums with n integers, your task is to check if it
// could become non-decreasing by modifying at most 1 element.

public class NonDecreasing {

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int cnt = 0;                                                                    //the number of changes
        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                    //modify nums[i-1] of a priority
                } else {
                    nums[i] = nums[i - 1];                                                //have to modify nums[i]
                }
            }
        }
        return cnt <= 1;
    }
}
