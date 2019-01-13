package com.company.LinkedList;

public class NodeFromLast extends MyLinkedList {


    public static void main(String[] args) {
        NodeFromLast list = new NodeFromLast();
        int[] values = {18, 5, 11, 30, 5, 19, 19, 23, 15, 6, 6, 2};
        for (int value : values) {
            list.insert(value);
        }
        System.out.println(list.getNthFromLast(list.head, 4));
    }

    int getNthFromLast(Node head, int n) {
        int count = 0;

        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count < n) {
            return -1;
        } else {
            int num = count - n;
            temp = head;
            while (num-- != 0) {
                temp = temp.next;
            }
        }
        return temp.data;
    }
}
