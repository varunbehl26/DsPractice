package com.company.codelity;

public class Rotation {

    public static void main(String[] args) {
        int[] ints = {3, 8, 9, 7, 6};
        solution(ints, 3);
    }

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (K == A.length) {
            return A;
        } else {
            int rotate = K;
            int[] tempArray = new int[A.length];
            for (int i = 0; i < K; i++) {
                tempArray[i] = A[rotate++ - 1];
            }
            int j = 0;
            for (int i = K; i < A.length; i++) {
                tempArray[i] = A[j++];
            }

            return tempArray;
        }
    }
}
