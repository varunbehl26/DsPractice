package com.company.gfg.topInterview.array;

public class MovZero {

    public static void main(String[] args) {
        int[] digits = {0, 1, 0, 3, 12};
        moveZeroes(digits);

        for (int digit : digits) {
            System.out.println(digit);
        }
    }

    //Input: [0,1,0,3,12]
    //Output: [1,3,12,0,0]
    public static void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        int nonZeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
            } else {
                nonZeroIndex = i;
            }


        }
    }
}
