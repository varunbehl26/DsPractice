package com.company.arrays.medium;


/*
    https://leetcode.com/problems/set-matrix-zeroes/
 */
public class MatrixZeroes {

//    public static void setZeroes(int[][] matrix) {
//        List<Integer> zeroList = new ArrayList<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == 0) {
//                    zeroList.add(i);
//                    zeroList.add(j);
//                }
//            }
//        }
//
//        for (int i = 0; i < zeroList.size(); i++) {
//            int x = zeroList.get(i);
//            int y = zeroList.get(i + 1);
//            do {
//                for (int j = 0; j < matrix.length; j++) {
//                    matrix[x][j] = 0;
//                }
//                for (int k = 0; k < matrix.length; k++) {
//                    matrix[k][y] = 0;
//                }
//                break;
//            } while (true);
//            i++;
//        }
//
//    }

    public static void setZeroes(int[][] matrix) {
        boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {

            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
            // We can use an additional variable for either the first row/column.
            // For this solution we are using an additional variable for the first column
            // and using matrix[0][0] for the first row.
            if (matrix[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < C; j++) {
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//        int[][] arr = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] arr = {{0, 1}};
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
