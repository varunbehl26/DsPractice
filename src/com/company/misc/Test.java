package com.company.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        List<List<Integer>> group = new ArrayList<>();
        group.add(Arrays.asList(1, 2, 3, 4));
        group.add(Arrays.asList(5, 6, 7, 8));
        group.add(Arrays.asList(9, 10, 11, 12));


        ArrayList<ArrayList<Integer>> B = (ArrayList<ArrayList<Integer>>) performOps(group);
        for (ArrayList<Integer> aB : B) {
            for (Integer anAB : aB) {
                System.out.print(anAB + " ");
            }
        }


    }

    static ArrayList<ArrayList<Integer>> performOps(List<List<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }
}
