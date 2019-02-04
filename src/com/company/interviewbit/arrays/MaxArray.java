package com.company.interviewbit.arrays;

public class MaxArray {
    public static void main(String[] args) {
        int[] A = {1,3,-1};

        int max_sum = maxSubArraySum(A);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }

    private static int maxSubArraySum(int[] a) {
        int size = a.length;
        int maxSoFar = a[0];
        int currMax = a[0];

        for (int i = 1; i < size; i++) {
            currMax = Math.max(a[i], currMax + a[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }


}
