package com.company.interviewbit.arrays;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        int[] A = {1,3,4,5,1};

        int max_sum = duplicate(A);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }

    private static int duplicate(int[] a) {
        int size = a.length;
        Map map=new HashMap();

        for (int i1 : a) {
            if (map.containsKey(i1)) {
                return i1;
            }
            map.put(i1, 1);
        }
        return -1;
    }


}
