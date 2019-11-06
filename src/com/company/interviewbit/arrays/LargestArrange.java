package com.company.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
    Given two numbers X and Y, how should myCompare() decide which number to put first – we compare two numbers
    XY (Y appended at the end of X) and YX (X appended at the end of Y). If XY is larger, then X should come before Y
    in output, else Y should come before. For example, let X and Y be 542 and 60. To compare X and Y, we compare 54260 and
    60542. Since 60542 is greater than 54260,
    we put Y first.
 */
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

        System.out.println(stringBuilder.toString());
    }
}
