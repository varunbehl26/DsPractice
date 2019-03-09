package com.company.Queue;

import java.util.ArrayList;
import java.util.List;

public class ListQueue {
    // store elements
    private List<Integer> data;
    // a pointer to indicate the start position
    private int p_start;

    public ListQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return data.get(p_start);
    }

    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_start >= data.size();
    }


    public static void main(String[] args) {
        ListQueue q = new ListQueue();
        q.enQueue(5);
        q.enQueue(3);

        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }

        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }

        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
    }
}