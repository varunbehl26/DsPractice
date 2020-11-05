package com.company.easy.arrays.easy;

public class OddCellsIncrement {

    public static int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < indices.length; i++) {
            int[] points = indices[i];
            int row = points[0];
            int column = points[1];
            for (int i1 = 0; i1 < m; i1++) {
                matrix[row][i1] = matrix[row][i1] + 1;
            }
            for (int i1 = 0; i1 < n; i1++) {
                matrix[i1][column] = matrix[i1][column] + 1;
            }
        }
        int oddCount = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        int[][] indices = {{1, 1}, {0, 0}};
        System.out.println(oddCells(n, m, indices));
    }
}
