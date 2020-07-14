package com.company.gfg.topInterview.strings;

public class isValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Marge, let's \"went.\" I await news telegram."));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            boolean b = !Character.isLetterOrDigit(s.charAt(i));
            if (b) {
                s = s.replace(s.charAt(i) + "", "");
            }
        }

        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(s.length() - i - 1) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}