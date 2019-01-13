package com.company.interviewbit;

public class LognPower {
    public static void main(String[] args) {
        System.out.println(power(71045970, 41535484));
    }


    private static long power(int x, int y) {
        long temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

}