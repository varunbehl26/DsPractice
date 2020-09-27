package com.company.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/
public class IntersectArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                if (val >= 1) {
                    list.add(i);
                    map.put(i, map.get(i) - 1);
                }
            }
        }
        int[] r = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            r[i] = list.get(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] A = {9, 4, 9, 8, 4};
        int[] B = {4, 9, 5};

        int[] C = intersect(A, B);

        for (int j : C) {
            System.out.println(j);
        }
    }
}
