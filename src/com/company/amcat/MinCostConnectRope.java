package com.company.amcat;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostConnectRope {

    public static void main(String[] args) {
        ArrayList<Integer> ropes = new ArrayList(4);
        ropes.add(8);
        ropes.add(4);
        ropes.add(6);
        ropes.add(12);
        System.out.println(minCost(ropes));
    }

    public static int minCost(List<Integer> ropes) {
        Queue<Integer> pq = new PriorityQueue(ropes);
        int totalCost = 0;
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            pq.add(cost);
            totalCost += cost;
        }
        return totalCost;
    }
}
