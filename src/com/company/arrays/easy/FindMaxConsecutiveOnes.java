package com.company.arrays.easy;

//https://leetcode.com/problems/max-consecutive-ones/
public class FindMaxConsecutiveOnes {

    /*
        Not necessary to take end -start +1 as the count,
        count as individual can also be used instead

        Logic
        Start with count and sum as 0
        if once a digit is one check max of count else reset
     */

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (num == 0) {
                // reset sum to zero when encounters zeros
                sum = 0;
            } else {
                // keep update count
                count = Math.max(count, sum);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1, 0, 1}));
    }


//    public static int findMaxConsecutiveOnes(int[] nums) {
//        int start = 0;
//        int end;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                if (nums[start] == 0) {
//                    start = i;
//                }
//                end = i;
//                count = Math.max(count, end - start + 1);
//            } else {
//                nums[start] = 0;
//            }
//        }
//
//        return count;
//    }
}
