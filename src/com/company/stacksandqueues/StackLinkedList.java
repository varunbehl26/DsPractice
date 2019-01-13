package com.company.stacksandqueues;

public class StackLinkedList {

    Node first;

    public StackLinkedList() {
        this.first = null;
    }

    public static void main(String[] args) {
        StackLinkedList stack1 = new StackLinkedList();

        stack1.push("a");
        stack1.push("b");
        stack1.push("c");

        stack1.print();
    }

    boolean isEmpty() {
        return first == null;
    }

    void push(String value) {
        Node oldFirst = first;
        first = new Node(value);
        first.item = value;
        first.next = oldFirst;
    }

    String pop() {
        String value = first.item;
        first = first.next;
        return value;
    }

    private void print() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

    class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
        }
    }
}