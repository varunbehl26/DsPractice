package com.company.easy.arrays.easy;

public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] out = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int[] arr = A[i];

            for (int k = 0; k < arr.length / 2; k++) {
                int temp = arr[k];
                arr[k] = arr[arr.length - 1 - k];
                arr[arr.length - 1 - k] = temp;
            }
            for (int j = 0; j < arr.length; j++) {
                arr[j] ^= 1;
            }

            out[i] = arr;
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };

        int[][] out = flipAndInvertImage(arr);

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                System.out.print(out[i][j]);
            }
            System.out.println("  ");
        }
    }
}
