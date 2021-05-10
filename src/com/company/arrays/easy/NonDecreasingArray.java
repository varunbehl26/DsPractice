package com.company.arrays.easy;

public class NonDecreasingArray {

    /*
        https://www.youtube.com/watch?v=Dxv_kCAYOk4
        // If the next element is smaller than the first on
     */
    public static boolean checkPossibility(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //Case where the first element is bigger

                if (i == 1 || arr[i - 2] <= arr[i]) {
                    arr[i - 1] = arr[i];
                } else {
                    arr[i] = arr[i - 1];
                }
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        System.out.println(checkPossibility(nums));
    }

}
