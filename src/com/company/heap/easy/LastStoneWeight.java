package com.company.heap.easy;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int stone : stones) {
            priorityQueue.add(stone);
        }
        while (priorityQueue.size() != 1) {
            if (priorityQueue.isEmpty()) {
                break;
            }
            int node1 = priorityQueue.poll();
            if (priorityQueue.isEmpty()) {
                break;
            }
            int node2 = priorityQueue.poll();
            int smashResult = Math.abs(node2 - node1);
            if (smashResult != 0) {
                priorityQueue.add(smashResult);
            }
        }
        if (priorityQueue.isEmpty()) {
            return 0;
        }
        return priorityQueue.poll();
    }


    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
