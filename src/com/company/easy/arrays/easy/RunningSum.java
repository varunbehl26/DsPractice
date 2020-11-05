package com.company.easy.arrays.easy;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int indexValue = 0;
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i] + indexValue;
            indexValue = output[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 1, 1, 1};
        int[] output = runningSum(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
