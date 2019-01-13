package com.company.tzom;


public class PerfectNum {
    public static void main(String[] args) {

        solve(5);
    }

    private static void solve(int num) {
        int diff = 11;
        int lengthDigit = (num / 2) * 2;
        System.out.println(lengthDigit);
        int valNumber = num - lengthDigit;
        System.out.println(valNumber);

        int diffMultiplies = (int) (11 * Math.pow(10, valNumber));
        System.out.println(diffMultiplies);


    }
}
