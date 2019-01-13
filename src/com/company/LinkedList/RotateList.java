package com.company.LinkedList;

public class RotateList extends MyLinkedList {

    public static void main(String[] args) {
        RotateList list = new RotateList();
        int[] values = {18, 5, 11, 30, 5, 19, 19, 23, 15, 6, 6, 2};
        for (int value : values) {
            list.insert(value);
        }
        list.rotate(list.head, 4);
        list.print();
    }

    public void rotate(Node head, int k) {
        //add code here.
        if (k == 0 && size() < k) {
            return;
        }
        Node temp = head;
        Node tempPrev = null;
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        int i = 0;
        while (i < k) {
            tempPrev = temp;
            temp = temp.next;
            i++;
        }
        lastNode.next = head;
        tempPrev.next = null;
        this.head = temp;
    }


}
