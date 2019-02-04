package com.company.interviewbit.arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] A = {6, 1, 4, 6, 3, 2, 7, 4};
        int k = 3;
        int l = 2;
        int max_sum = maxSubArraySum(A);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }

    private static int maxSubArraySum(int[] a) {
        int size = a.length;
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
