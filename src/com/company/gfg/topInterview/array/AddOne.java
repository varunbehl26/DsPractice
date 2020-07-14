package com.company.gfg.topInterview.array;

public class AddOne {

    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        int[] values = plusOne(digits);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length + 1];

        int carr = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i] += 1;
            } else {
                digits[i] += carr;
                carr = 0;
            }
            if (digits[i] >= 10) {
                carr = digits[i] / 10;
                digits[i] = digits[i] % 10;
            }
        }
        if (carr != 0) {
            arr[0] = carr;
            System.arraycopy(digits, 0, arr, 1, arr.length - 1);
        } else {
            arr = digits;
        }
        return arr;
    }
}
