package com.company.easy.arrays.easy;

public class MinTimeVisitingPlaces {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int maxCount = 0;
        for (int i = 1; i < points.length; ++i) {
            int[] startPoint = points[i];
            int[] destinationPoint = points[i - 1];
            maxCount += Math.max(Math.abs(startPoint[0] - destinationPoint[0]), Math.abs(startPoint[1] - destinationPoint[1]));
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1},
                {3, 4},
                {-1, 0}
        };

        System.out.println(minTimeToVisitAllPoints(arr));
    }
}
