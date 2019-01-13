package com.company.misc;

public class StackNode {
    public int data;
    public int minSoFar;

    public StackNode() {
    }

    public StackNode(int data) {
        this.data = data;
    }

    public StackNode(int data, int minSoFar) {
        this.data = data;
        this.minSoFar = minSoFar;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "data=" + data +
                ", minSoFar=" + minSoFar +
                '}';
    }
}
