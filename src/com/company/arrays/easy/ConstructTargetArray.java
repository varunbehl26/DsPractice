package com.company.arrays.easy;

import java.util.PriorityQueue;

/*
    https://www.youtube.com/watch?v=OKRkQ1YT_2s
    Use priority queue to get max element alaways
    Then sum of all elements
    Start from max and try to reach 1 , if got to while subtracting nume from sum
    then true else false
 */
public class ConstructTargetArray {

    public static boolean isPossible(int[] target) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> (b - a));
        long sum = 0;
        for (int a : target) {
            sum += a;
            priorityQueue.add(a);
        }
        while (true) {
            int popNode = priorityQueue.poll();
            sum -= popNode;
            if (popNode == 1 || sum == 1) {
                return true;
            } else if (popNode < sum || sum == 0 || popNode % sum == 0) {
                return false;
            } else {
                //To cover the case where the difference is too large
                popNode %= sum;
                sum += popNode;
                priorityQueue.add(popNode);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPossible(new int[]{9, 3, 5}));
    }
}
