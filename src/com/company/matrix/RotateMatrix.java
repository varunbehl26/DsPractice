package com.company.matrix;

//clockwise rotate elements in it.

//To rotate a ring, we need to do following.
//    1) Move elements of top row.
//    2) Move elements of last column.
//    3) Move elements of bottom row.
//    4) Move elements of first column.
public class RotateMatrix {

    private static int R = 3;
    private static int C = 3;

    public static void main(String[] args) {
        // Test Case 1
//        int a[][] = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };

        // Tese Case 2
        int a[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        rotateMatrix(R, C, a);

    }


    private static void rotateMatrix(int m, int n, int[][] mat) {
        int row = 0, col = 0;
        int prev, curr;

        /*
        row - Staring row index
        m - ending row index
        col - starting column index
        n - ending column index
        i - iterator
        */
        while (row < m && col < n) {

            if (row + 1 == m || col + 1 == n)
                break;

            // Store the first element of next
            // row, this element will replace
            // first element of current row
            prev = mat[row + 1][col];

            // Move elements of first row
            // from the remaining rows
            for (int i = col; i < n; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;

            // Move elements of last column
            // from the remaining columns
            for (int i = row; i < m; i++) {
                curr = mat[i][n - 1];
                mat[i][n - 1] = prev;
                prev = curr;
            }
            n--;

            // Move elements of last row
            // from the remaining rows
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat[m - 1][i];
                    mat[m - 1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            // Move elements of first column
            // from the remaining rows
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }

        // Print rotated matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }

}
