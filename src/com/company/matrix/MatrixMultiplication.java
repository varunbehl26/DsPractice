package com.company.matrix;

public class MatrixMultiplication {
    private static int N = 4;


    public static void main(String[] args) {
        int[][] mat1 = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        int[][] mat2 = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        // To store result
        int[][] res = new int[N][N];

        multiply(mat1, mat2, res);

        System.out.println("Result matrix is ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }

    private static void multiply(int[][] mat1, int[][] mat2, int[][] res) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][i];
                }
            }
        }

    }
}
