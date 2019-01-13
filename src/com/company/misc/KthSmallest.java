package com.company.misc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class KthSmallest {

    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int length = in.nextInt();
            int[] values = new int[length];
            for (int i = 0; i < length; i++) {
                values[i] = in.nextInt();
            }
            int smallestNum = in.nextInt();
            Arrays.sort(values);

            Stack<Integer> stack = new Stack();
            for (int i = values.length - 1; i >= 0; i--) {
                stack.push(values[i]);
            }

            while (smallestNum > 1) {
                stack.pop();
                smallestNum--;
            }
            System.out.println(stack.peek());
        }
    }
}
