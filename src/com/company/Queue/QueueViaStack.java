package com.company.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueViaStack {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();


    }


    class Myqueue {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        void enque(int val) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(val);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }


        int deque() {
            return s2.pop();
        }


    }
}
