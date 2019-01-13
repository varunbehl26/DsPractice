package com.company.Queue;

public class LinkedListQueue {

    Node first, last;

    boolean isEmpty() {
        return first == null;
    }

    void enque(int num) {
        Node oldLast = last;
        last = new Node(num);
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    int deque() {
        int item = first.data;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
