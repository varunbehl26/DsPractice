package com.company.arrays.easy;

public class NonDecreasingArray {


    public static boolean checkPossibility(int[] nums) {
        boolean foundIncreasingOnce = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {

            } else {
                if (foundIncreasingOnce) {
                    foundIncreasingOnce = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

}
