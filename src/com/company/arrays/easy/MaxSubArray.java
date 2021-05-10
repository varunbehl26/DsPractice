package com.company.arrays.easy;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
            max = Math.max(max, maxSoFar);
        }
        return max;
    }

    public static void main(String[] args) {
        int input[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(input));
    }
}
