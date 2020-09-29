package com.company.easy.strings;

public class ReverseInteger {

    public static int reverse(int x) {
        int output = 0;
        while (x != 0) {
            output = 10 * output + x % 10;
            x = x / 10;
            if (output >= Integer.MAX_VALUE || output <= Integer.MIN_VALUE) {
                return 0;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
