package com.company.dailyChallenge;

import java.util.Stack;

//https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3484/discuss/256740/JavaC++Python-Find-111.....1111-greater-N

//Hints
//what is the relationship between input and output
//input + output = 111....11 in binary format
//Is there any corner case?
//0 is a corner case expecting 1, output > input
public class BitwiseComplement {

//    input + output = 111....11 in binary format
//  x = 1 => 1 => 1
//  x = 3 => (2*1 + 1) => 11
//  x = 7 => (3*2 + 1) => 111
//  x = 15 => (7*2 + 1) => 1111

    public static int bitwiseComplement(int N) {
        int X = 1;
        while (N > X) {
            X = X * 2 + 1;
        }
        return X - N;
    }

    public static int bitwiseComplementMY(int N) {
        String binaryNum = binary(N);
        String complement = complement(binaryNum);
        return decimal(complement);
    }

    private static int decimal(String complement) {
        char[] chars = complement.toCharArray();
        int result = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            result += Math.pow(2, chars.length - i - 1) * Integer.parseInt(chars[i] + "");
        }
        return result;
    }

    private static String complement(String binaryNum) {
        char[] chars = binaryNum.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                chars[i] = '0';
            } else {
                chars[i] = '1';
            }
        }
        StringBuilder output = new StringBuilder();
        for (char aChar : chars) {
            output.append(aChar);
        }
        return String.valueOf(output);
    }

    private static String binary(int num) {
        Stack<Integer> s = new Stack();
        while (num > 1) {
            int rem = num % 2;
            s.push(rem);
            num = num / 2;
        }
        s.push(num);
        StringBuilder output = new StringBuilder();
        while (!s.isEmpty()) {
            output.append(s.pop());
        }
        return String.valueOf(output);
    }


    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
}
