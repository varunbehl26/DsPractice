package com.company.easy.arrays.easy;

public class SmallerNumbersThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] out = new int[nums.length];

        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                out[i] = 0;
            } else {
                out[i] = count[nums[i] - 1];
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] inp = {8, 1, 2, 2, 3};
        int[] out = smallerNumbersThanCurrent(inp);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
