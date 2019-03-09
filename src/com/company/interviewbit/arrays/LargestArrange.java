package com.company.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestArrange {
    public static void main(String[] args) {
        Integer[] A = {3, 30, 34, 5, 9};
        List<String> list = new ArrayList<String>();


        for (Integer integer : A) {
            list.add(integer.toString());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                System.out.println("Comparing " + x + " and " + y + "");
                String xy = x + y;
                String yx = y + x;

                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : list) {
            stringBuilder.append(s);
        }

        stringBuilder.toString();
    }
}
