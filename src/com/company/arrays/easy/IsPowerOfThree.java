package com.company.arrays.easy;


//Always check boundary conditions
public class IsPowerOfThree {

    public static boolean isPowerOfThreeMy(int n) {
        if (n == 0 || n == 2) {
            return false;
        }
        while (n != 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPowerOfThree(int n) {
        if (n > 1) {
            while (n % 3 == 0) {
                n /= 3;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }
}
