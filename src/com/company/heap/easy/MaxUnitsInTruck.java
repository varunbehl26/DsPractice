package com.company.heap.easy;

import java.util.PriorityQueue;

public class MaxUnitsInTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);


        int maxUnits = 0;
        while (truckSize != 0 && !queue.isEmpty()) {
            int[] row = queue.poll();
            int boxes = Math.min(truckSize, row[0]);

            maxUnits += boxes * row[1];
            truckSize -= boxes;
        }

        return maxUnits;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }
}
