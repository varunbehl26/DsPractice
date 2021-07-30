package com.company.arrays.medium;


/*
    Solution is to calculate lefts and right separately and then output is left * right
    Two for loops are to calculate left and right
 */
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            output[i] = left;
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1)
                right = right * nums[i + 1];
            output[i] *= right;
        }

        return output;
    }


    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = productExceptSelf(input);
        for (int i : output) {
            System.out.println(i);
        }
    }
}
