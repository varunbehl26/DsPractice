package com.company.gfg.must.easy;

public class SumWithOperator {

    public static void main(String[] args) {
        System.out.println(count_one(7));
    }

//    public static int getSum(int a, int b) {
//
//    }

    static int count_one(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
