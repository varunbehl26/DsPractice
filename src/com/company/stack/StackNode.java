package com.company.stack;

public class StackNode<T> {
    T data;
    StackNode<T> next;

    StackNode(T data) {
        this.data = data;
    }
}
