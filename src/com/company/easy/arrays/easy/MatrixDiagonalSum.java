package com.company.easy.arrays.easy;

public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - 1 - i];
        }
        //If the length of the matrix is odd, then the center cell will be overlapped on the two diagonals,
        // we should deduct it from the result.
        if (mat.length % 2 != 0) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(diagonalSum(mat));

    }
}
