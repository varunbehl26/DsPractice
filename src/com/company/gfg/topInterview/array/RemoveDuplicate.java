package com.company.gfg.topInterview.array;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println((nums[i]));
        }
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int curr = 0;
        int next = 1;

        while (next != nums.length) {
            if (nums[next] > nums[curr]) {
                curr++;
                nums[curr] = nums[next];
            } else {
                next++;
            }
        }
        return curr + 1;
    }
}
