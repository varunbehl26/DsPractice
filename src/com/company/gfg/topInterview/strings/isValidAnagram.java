package com.company.gfg.topInterview.strings;

public class isValidAnagram {


    public static void main(String[] args) {
        String s = "anagram";
        String s1 = "nagaram";

        System.out.println(isAnagram(s, s1));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
