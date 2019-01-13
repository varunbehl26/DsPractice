package com.company.stacksandqueues;

public class StackArray {
    int capacity;
    int[] nodes;
    int top;

    public StackArray(int capacity, int[] nodes) {
        this.capacity = capacity;
        this.nodes = nodes;
    }

    StackArray() {
        top = -1;
        capacity = 5;
        nodes = new int[capacity];
    }

    boolean isEmpty() {
        return top < 0;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

}