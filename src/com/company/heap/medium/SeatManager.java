package com.company.heap.medium;

import java.util.PriorityQueue;

/*
    The logic is to have all the tickets in the queue
    natural order is ascending, and when someone reserves ticket
    that ticket can be popped so its not available to book
    else push it back to system so it is available to book
 */
class SeatManager {

    PriorityQueue<Integer> ticketList;

    public SeatManager(int n) {
        ticketList = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            ticketList.offer(i);
        }
    }

    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(5);
        System.out.println(seatManager.reserve());
        System.out.println(seatManager.reserve());
        seatManager.unreserve(2);
        System.out.println(seatManager.reserve());
        System.out.println(seatManager.reserve());
        System.out.println(seatManager.reserve());
        System.out.println(seatManager.reserve());
        seatManager.unreserve(5);
    }

    public int reserve() {
        int peek = ticketList.peek();
        ticketList.poll();
        return peek;
    }

    public void unreserve(int seatNumber) {
        ticketList.offer(seatNumber);
    }
}