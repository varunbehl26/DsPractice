package com.company.gfg.topInterview.strings;

public class ReverseInteger {

    public static void main(String[] args) {
        int val = -123;
        System.out.println(reverse(val));
    }

    public static int reverse(int x) {
        long longVal = 0L;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            longVal = longVal * 10 + temp;
        }
        if (longVal > Integer.MAX_VALUE || longVal < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) longVal;
    }

}
