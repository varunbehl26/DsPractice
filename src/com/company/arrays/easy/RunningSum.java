package com.company.arrays.easy;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            output[i] = num + output[i - 1];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 10, 1};
        int[] output = runningSum(input);
        for (int j : output) {
            System.out.println(j);
        }

    }


}
