package com.company.gfg.topInterview.array;

public class RotateArray {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        rotate(ints, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static void rotate(int[] nums, int k) {
        while (k != 0) {
            int temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i + 1] = nums[i];
            }
            nums[nums.length - 1] = temp;

            k--;
        }
    }
}
