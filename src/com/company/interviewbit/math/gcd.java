package com.company.interviewbit.math;

public class gcd {


    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
//        System.out.println(fib(6));
        System.out.println(gcd(10, 8));
    }

    private static int fib(int i) {
        if (i >= 3) {
            return fib(i - 1) + fib(i - 2);
        } else {
            return 1;
        }

    }


}
