package com.company.interviewbit.arrays;

import java.util.ArrayList;


public class FirstMissingPositive {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(-1);
        list.add(1);
        System.out.println(firstMissingPositive(list));
    }

    public static int firstMissingPositive(ArrayList<Integer> A) {
//        int numRange=A.size();
//        int sum=(numRange*(numRange+1))/2;
//
//        for (Integer integer : A) {
//            if (integer > 0) {
//                sum -= integer;
//            }
//        }
//
//        return sum>0?sum:1;
        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            int pos = num - 1;

            if (pos >= 0 && pos < A.size() && A.get(pos) != num) {
                A.set(i, A.get(pos));
                A.set(pos, num);
                i--;
            }
        }

        for (int i = 0; i < A.size(); i++)
            if (A.get(i) != i + 1)
                return i + 1;

        return A.size() + 1;
    }
}
