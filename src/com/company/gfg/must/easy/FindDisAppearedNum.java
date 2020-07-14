package com.company.gfg.must.easy;

import java.util.ArrayList;
import java.util.List;

//A more detailed explanation for those who might still be confused:
//
//This solution is using the relation between array index ([0, n-1]) and the given value range [1,n].
//
//Each time when a new value X is read, it changes the corresponding Xth number (value at index X-1) into negative, indicating value X is read for the first time.
//For example. using the given test case [4,3,2,7,8,2,3,1], when it comes to i = 2 in the first loop, this solution marks the 2nd number (index = 1), indicating we've found number 2 for the first time.
//
//When we encounter a redundant number Y, because we've marked the Yth position (index Y -1) when we saw Y for the first time, the if clause won't let us flip it again. This leaves the already marked Yth number (number at index Y-1) negative.
//For example, in the given test case, when i = 5, val = |2| - 1 = 1, nums[1] = -3 < 0. No flip operation is needed because we've found value 2 before.
//
//Looping through the 1st loop takes O(n) time, flipping signs won't take extra space.
//
//The second loop checks the signs of the values at indices. If the sign at index P is negative, it means value P + 1 is in the array. e.g. nums[0] = -4, so value 0+1 = 1 is in the array. If the value at index Q is positive, then value Q + 1 is not in the array. e.g. nums[4] = 8 > 0, value 4 + 1 = 5, we add 5 into the ret list.
public class FindDisAppearedNum {

    public static void main(String[] args) {
        int[] ints = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDisappearedNumbers(ints);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i + 1);
            }
        }

        return ret;
    }
}
