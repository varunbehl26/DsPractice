package com.company.LinkedList.toDiscuss;

import com.company.LinkedList.MyLinkedList;

public class RevereList extends MyLinkedList {

    public static void main(String[] args) {
        RevereList list = new RevereList();
        int[] values = {18, 5, 11, 30, 5, 19, 19, 23, 15, 6, 6, 2};
        for (int value : values) {
            list.insert(value);

        }
        list.reverse();
        list.print();
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

}
