package com.company.easy.strings;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
public class ReverseString {

    public static void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
