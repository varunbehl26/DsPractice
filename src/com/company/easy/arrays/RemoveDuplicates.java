package com.company.easy.arrays;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int currentIndex = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[currentIndex]) {
                currentIndex++;
                nums[currentIndex] = nums[j];
            }
        }
        return currentIndex + 1;
    }


    public static void main(String[] args) {
//        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3};
        int[] arr = {};

        int num = removeDuplicates(arr);
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}
