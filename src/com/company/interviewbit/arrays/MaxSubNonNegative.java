package com.company.interviewbit.arrays;

import java.util.LinkedList;

public class MaxSubNonNegative {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, -7, 2, 3};
//        int[] arr = {-1, -1, -1, -1, -1 };
//        int[] arr = {0, 0, -1, 0 };
        int[] arr = {336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421};
        maxSubArraySum(arr);

    }

    private static int[] maxSubArraySum(int[] A) {
        int size = A.length;

        LinkedList<Integer>[] lists = new LinkedList[size];

        int i = 0;
        while (i < size) {
            int j = i;
            while (j < size) {
                if (A[j] > 0) {
                    if (lists[i] == null) {
                        lists[i] = new LinkedList();
                    }
                    lists[i].add(A[j]);
                } else {
                    break;
                }
                j++;
            }
            if (i == j) {
                i++;
            } else {
                i = j;
            }
        }
        long[] listsMax = new long[lists.length];
        int maxIndex = 0;

        for (i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                for (int j = 0; j < lists[i].size(); j++) {
                    System.out.println("lists[i].get(j)" + lists[i].get(j));

                    listsMax[i] += lists[i].get(j);
                    System.out.println("listsMax[i]" + listsMax[i]);
                }
                if (listsMax[maxIndex] < listsMax[i]) {
                    maxIndex = i;
                }
            }
        }
        if (lists[maxIndex] == null) {
            return new int[0];
        }
        int[] values = new int[lists[maxIndex].size()];
        LinkedList<Integer> list = lists[maxIndex];
        for (int i1 = 0; i1 < list.size(); i1++) {
            values[i1] = list.get(i1);
        }
        return values;
    }
}
