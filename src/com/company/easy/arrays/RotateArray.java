package com.company.easy.arrays;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
public class RotateArray {

//    public static void rotate(int[] nums, int k) {
//        if (k == 0) {
//            return;
//        }
//
//        while (k != 0) {
//            int temp = nums[nums.length - 1];
//            for (int i = nums.length - 1; i > 0; i--) {
//                nums[i]=nums[i-1];
//            }
//            nums[0]=temp;
//            k--;
//        }
//
//    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void main(String[] args) {

        int[] ints = {1, 2};
        rotate(ints, 3);
        for (int anInt : ints) {
            System.out.print(anInt);
            System.out.print(" ");
        }
    }
}
