package com.company;

//This needs to be done in O(n), therefore used two pointers one from start and other from end

public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int j = 0;
        int start = -1;
        int end = -1;
        int last = nums.length - 1;
        for (int first = 0; (first < nums.length) && j < 2; first++, last--) {
            if (nums[first] == target && start == -1) {
                start = first;
                j++;
            }
            if (nums[last] == target && end == -1) {
                end = last;
                j++;
            }
        }

        return new int[]{start, end};
    }


    public static void main(String[] args) {
        int[] ints = {5, 7, 7, 8, 8, 10};
        int[] arr = searchRange(ints, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
