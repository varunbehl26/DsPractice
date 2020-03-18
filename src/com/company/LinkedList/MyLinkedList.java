package com.company.LinkedList;

public class MyLinkedList {
    public Node head;

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(2);
        list.insert(9);
        list.insert(7);
        list.insert(10);
//        list.print();
//        System.out.println(list.findMiddleElement());
        list.print();
    }

    public int size() {
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            Node tmp = head;
            while (tmp != null) {
                tmp = tmp.next;
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            Node node1 = head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;
        }
    }

    public void print() {
        if (isEmpty()) {
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public class Node {
        public Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

}
