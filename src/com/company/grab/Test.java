package com.company.grab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static int solution(Integer[] A, int k, int l) {
        int totalKAndL = 0;
        int startIndex=0;
        if (k==l){
            return -1;
        }
        Integer[] a=new Integer[A.length];
        System.arraycopy(A, 0, a, 0, A.length);
        Integer[] maxAndStartIndex = getMaxContinuous(a, k,startIndex);

        totalKAndL += maxAndStartIndex[0];

        a = getFormattedArray(a, maxAndStartIndex[1], k);

        maxAndStartIndex = getMaxContinuous(a, l, startIndex);

        totalKAndL += maxAndStartIndex[0];

        return totalKAndL;
    }

    private static Integer[] getFormattedArray(Integer[] a, Integer startIndex, int k) {
        List<Integer> integers = new ArrayList<>();

        integers.addAll(Arrays.asList(a).subList(0, startIndex));
        integers.addAll(Arrays.asList(a).subList(startIndex + k, a.length));

        return (integers).toArray(new Integer[0]);
    }

    private static Integer[] getMaxContinuous(Integer[] a, int nuElementsToCheck, int startIndex) {
        int sum = 0;
        int tempSum = 0;
        int index = 0;

        Integer[] maxAndStartIndex = new Integer[2];
        for (int i = 0; i < a.length; i++) {
            if (i <= a.length - nuElementsToCheck) {
                for (int j = i; j < i + nuElementsToCheck; j++) {
                    sum += a[j];
                }
            }

            if (sum > tempSum) {
                tempSum = sum;
                index = i;
            }
            sum = 0;
        }
        maxAndStartIndex[0] = tempSum;
        maxAndStartIndex[1] = index;
        return maxAndStartIndex;
    }

    public static void main(String[] args) {
        Integer a[] = {0,1};

        System.out.println(solution(a, 2, 3));

    }
}