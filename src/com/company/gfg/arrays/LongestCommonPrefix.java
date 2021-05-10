package com.company.gfg.arrays;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/longest-common-prefix/solution/
public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] str = {"abcdefgh", "abcdfghijk", "abcefgh", "abcefsdgh"};
        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, str);
        System.out.println(longestCommonPrefix(wordList));
    }

    //https://leetcode.com/media/original_images/14_basic.png
    public static String longestCommonPrefix(ArrayList<String> stringArrayList) {
        if (stringArrayList.size() == 0) {
            return "";
        }
        String prefix = stringArrayList.get(0);
        for (int i = 1; i < stringArrayList.size(); i++)
            while (stringArrayList.get(i).indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix + " i " + i);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        return prefix;
    }

//    //Divide and conquer
//    //https://leetcode.com/media/original_images/14_lcp_binary_search.png
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0)
//            return "";
//        int minLen = Integer.MAX_VALUE;
//        for (String str : strs)
//            minLen = Math.min(minLen, str.length());
//        int low = 1;
//        int high = minLen;
//        while (low <= high) {
//            int middle = (low + high) / 2;
//            if (isCommonPrefix(strs, middle))
//                low = middle + 1;
//            else
//                high = middle - 1;
//        }
//        return strs[0].substring(0, (low + high) / 2);
//    }
//
//    private static boolean isCommonPrefix(String[] strs, int len) {
//        String str1 = strs[0].substring(0, len);
//        for (int i = 1; i < strs.length; i++)
//            if (!strs[i].startsWith(str1))
//                return false;
//        return true;
//    }
}
