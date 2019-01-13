package com.company.stacksandqueues;

import com.company.misc.StackNode;

import java.util.Arrays;


public class MinStack {
    int capacity;
    StackNode[] nodes;
    int top;
    int minSoFar = Integer.MAX_VALUE;

    public MinStack(int capacity, StackNode[] nodes) {
        this.capacity = capacity;
        this.nodes = nodes;
    }

    MinStack() {
        top = -1;
        capacity = 30;
        nodes = new StackNode[30];
    }

    boolean isEmpty() {
        return top < 0;
    }

    public void push(int value) {
        if (top >= capacity) {
            System.out.println("Stack Overflow");
        } else {
            int i = ++top;
            nodes[i] = new StackNode();
            if (value < minSoFar) {
                nodes[i].minSoFar = value;
                minSoFar = value;
            } else {
                nodes[i].minSoFar = minSoFar;
            }
            nodes[i].data = value;
        }
    }


    public StackNode pop() {
        if (top == -1) {
            return null;
        } else {
            return nodes[top--];
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "capacity=" + capacity +
                ", nodes=" + Arrays.toString(nodes) +
                ", top=" + top +
                ", minSoFar=" + minSoFar +
                '}';
    }
}
