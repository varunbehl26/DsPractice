package com.company.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class NobleInteger {

    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer integer : A) {
            if (!map.containsKey(integer)) {
                map.put(integer, 0);
            }
            map.put(integer, map.get(integer) + 1);
        }
        Set<Integer> keySet = map.keySet();
        Integer[] objects = (Integer[]) keySet.toArray();

        return -1;


    }
}