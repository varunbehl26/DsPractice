package com.company.easy.string;

public class MaxDepthParentheses {

    //While traversing check two counts, current depth count
    // and a max depth count till now and comparing them each time
    // will give the max
    public static int maxDepth(String s) {
        int count = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                count = Math.max(count, ++cur);
            } else if (s.charAt(i) == ')') {
                cur--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("((8+7)*(3+9)-0)*(1*6)"));
    }
}
