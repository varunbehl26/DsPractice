package com.company.easy.arrays.easy;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        for (int k = 0, i = 0; k < n; k++, i = i + 2) {
            output[i] = nums[k];
        }
        for (int i = n, k = 1; i < 2 * n; k = k + 2, i++) {
            output[k] = nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] res = shuffle(input, 4);
        for (int re : res) {
            System.out.println(re);
        }

    }
}
