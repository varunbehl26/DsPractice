package com.company.arrays.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*-- Things to Note
1. Brute force works
2. Look at the boundary conditions
2. Look at the possibilities based on all the test cases.
*/


public class PowerfulIntegers {

//    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
//        TreeSet<Integer> integerSet = new TreeSet<Integer>();
//
//        for (int i = 0; i <= 100; i++) {
//            for (int j = 0; j <= 100; j++) {
//                double v = Math.pow(x, i) + Math.pow(y, j);
//                if (v <= bound) {
//                    integerSet.add((int) v);
//                }
//            }
//        }
//
//        List<Integer> mainList = new ArrayList<Integer>();
//        mainList.addAll(integerSet);
//
//        return mainList;
//    }

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {

        int a = x == 1 ? bound : (int) (Math.log(bound) / Math.log(x));
        int b = y == 1 ? bound : (int) (Math.log(bound) / Math.log(y));

        HashSet<Integer> powerfulIntegers = new HashSet<Integer>();

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {

                int value = (int) Math.pow(x, i) + (int) Math.pow(y, j);

                if (value <= bound) {
                    powerfulIntegers.add(value);
                }

                // No point in considering other powers of "1".
                if (y == 1) {
                    break;
                }
            }

            if (x == 1) {
                break;
            }
        }

        return new ArrayList<>(powerfulIntegers);
    }

    public static void main(String[] args) {
        List<Integer> result = powerfulIntegers(1, 2, 100);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
