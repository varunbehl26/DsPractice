package com.company.interviewbit.arrays;

public class MinSteps {

    public static void main(String[] args) {
        int[] A = {-7, -13};
        int[] B = {1, -5};
        System.out.println(coverPoints(A, B));

    }


    public static int coverPoints(int[] A, int[] B) {
        int points = 0;
        if (A.length == 0 || B.length == 0) {
            return 0;
        } else {
            int j = 0;
            for (int i = 0; i < A.length - 1; i++) {
                points += distCalc(A[i], B[i], A[i + 1], B[i + 1]);
            }
        }
        return points;
    }

    private static int distCalc(int x, int y, int x1, int y1) {
        int dx = x1 - x;
        int dy = y1 - y;

        return Math.max(dx, dy);
    }
}