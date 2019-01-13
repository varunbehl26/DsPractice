package com.company.Queue;

public class ArrayQueue {

    int[] values;
    int rear;
    int front;
    int size;
    int capacity;


    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = 0;
        values = new int[capacity];

    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
//
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        queue.enqueue(80);

    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int value) {
        if (isFull()) {
            return;
        }
        values[rear++] = value;
        size++;
    }

    int deque() {
        if (isEmpty()) {
            return -1;
        }
        size--;
        return values[front++];
    }
}
