package com.company.easy.string.medium;

import java.util.Stack;

//TOOD
public class ParenthesisMinInsertion {

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (stack.isEmpty()) {
                    stack.add(c);
                } else {
                    if (stack.peek() == ')') {
                        //in this case, we need to add one more ')' to get two consecutive right paren,
                        // then we could pop the one ')' and one '(' off the stack
                        count++;
                        stack.pop();
                        stack.pop();
                        stack.add(c);
                    } else {
                        stack.add(c);
                    }
                }
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    //in this case, we need to add one '(' before we add this ')' onto this stack
                    count++;
                    stack.add('(');
                    stack.add(c);
                } else {
                    if (stack.peek() == ')') {
                        //in this case, we could pop the one ')' and one '(' off the stack
                        stack.pop();
                        stack.pop();
                    } else {
                        stack.add(c);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            char pop = stack.pop();
            if (pop == '(') {
                count += 2;
            } else {
                count++;
                stack.pop();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("())"));
    }
}
