package com.company.easy.strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replace(" ", "");
        char[] chars = s1.toCharArray();
        int length = chars.length;
        int j = length - 1;
        int i = 0;
        while (i < length) {
            if (chars[i] >= 97 && chars[i] <= 122 || chars[i] >= 48 && chars[i] <= 57) {
                if (chars[j] >= 97 && chars[j] <= 122 || chars[j] >= 48 && chars[j] <= 57) {
                    if (chars[i] == chars[j]) {
                        j--;
                        i++;
                    } else {
                        return false;
                    }
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }
}
