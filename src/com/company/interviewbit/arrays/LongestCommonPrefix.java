package com.company.interviewbit.arrays;

import java.util.ArrayList;

//https://leetcode.com/problems/longest-common-prefix/solution/
public class LongestCommonPrefix {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add("abcdefgh");
        arrayList.add("abefghijk");
        arrayList.add("abcefgh");


        String[] str={"abcdefgh","abefghijk", "abcefgh"};


        System.out.println(longestCommonPrefix(str));

//        System.out.println(longestCommonPrefix(arrayList));
    }

    //https://leetcode.com/media/original_images/14_basic.png
    public static String longestCommonPrefix(ArrayList<String> strs) {
        if (strs.size() == 0) return "";
        String prefix = strs.get(0);
        for (int i = 1; i < strs.size(); i++)
            while (strs.get(i).indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    //Divide and conquer
    //https://leetcode.com/media/original_images/14_lcp_binary_search.png
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean isCommonPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }
}
