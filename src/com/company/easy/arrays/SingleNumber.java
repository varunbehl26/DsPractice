package com.company.easy.arrays;


//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
//Bit Manipulation
//Concept
//
//If we take XOR of zero and some bit, it will return that bit
//a⊕0=a
//If we take XOR of two same bits, it will return 0
// a⊕a=0
// a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
//So we can XOR all bits together to find the unique number.
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        if (nums.length == 0) return -1;
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
