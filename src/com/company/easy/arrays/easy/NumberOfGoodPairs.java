package com.company.easy.arrays.easy;

public class NumberOfGoodPairs {

    //    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    //optimised
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        int count[] = new int[101];
        for (int a : nums) {
            result += count[a]++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 1, 3};
//        int[] input = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(input));
    }
}
