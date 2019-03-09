package com.company.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);


        nextPermutation(list);


    }

    public static void nextPermutation(ArrayList<Integer> a) {
        if (!a.isEmpty()) {

            int index = 0;
            boolean isPossible = false;
            for (int i = a.size() - 1; i > 0; i--) {
                if (a.get(i) > a.get(i - 1)) {
                    index = i - 1;
                    isPossible = true;
                    break;
                }
            }


            if (isPossible) {
                int temp = a.get(index);
                a.set(index, a.get(a.size() - 1));
                a.set(a.size() - 1, temp);
                Collections.sort(a.subList(index + 1, a.size()));

            } else {
                Collections.sort(a);
            }


        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }

    }
}
