package com.company.strings;

public class LongestPrefix {
    /* Driver Function to test other function */
    public static void main(String[] args) {
        LongestPrefix gfg = new LongestPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geeker"};
        System.out.println("The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            System.out.println("---" + strs[i]);
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                System.out.println(pre);
            }
        }
        return pre;
    }

//    private String longestCommonPrefix(String[] a) {
//        int size = a.length;
//
//        /* if size is 0, return empty string */
//        if (size == 0) {
//            return "";
//        }
//
//        if (size == 1) {
//            return a[0];
//        }
//
//        /* sort the array of strings */
//        Arrays.sort(a);
//
//        /* find the minimum length from first and last string */
//        int end = Math.min(a[0].length(), a[size - 1].length());
//
//        /* find the common prefix between the first and
//           last string */
//        int i = 0;
//        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i)) {
//            i++;
//        }
//
//        return a[0].substring(0, i);
//    }

}
