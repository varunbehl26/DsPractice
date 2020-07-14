package com.company.gfg.must.easy;

import java.util.Stack;

//Output: "s'teL ekat edoCteeL tsetnoc"
public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }

        String[] chars = sb.toString().split(" ");

        for (String aChar : chars) {
            stack.add(aChar);
        }
        StringBuilder newSb = new StringBuilder();

        while (!stack.isEmpty()) {
            newSb.append(stack.pop());
            newSb.append(" ");
        }

        return newSb.toString().trim();
    }
}
