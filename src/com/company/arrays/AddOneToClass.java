package com.company.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToClass {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
//        a.add(6);
//        a.add(0);
//        a.add(6);
//        a.add(4);
//        a.add(8);
//        a.add(8);
//        a.add(1);
        plusOne(a);
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carr = 0;
        int e;
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = A.size() - 1; i >= 0; i--) {
            if (i == A.size() - 1) {
                e = A.get(i) + 1;
            } else {
                e = A.get(i) + carr;
                carr = 0;
            }

            if (e >= 10) {
                result.add(e % 10);
                carr = e / 10;
            } else {
                result.add(e);
            }

        }
        if (carr > 0) {
            result.add(carr);
        }
        Collections.reverse(result);


        while (checkIfFirstZero(result)) ;


        for (Integer integer : result) {
            System.out.println(integer);
        }
        return result;
    }

    private static boolean checkIfFirstZero(ArrayList<Integer> result) {
        if (result.get(0) == 0) {
            result.remove(0);
            return true;
        }
        return false;
    }
}
