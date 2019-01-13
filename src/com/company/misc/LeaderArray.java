package com.company.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaderArray {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {

            int length = in.nextInt();
            int[] values = new int[length];
            for (int i = 0; i < length; i++) {
                values[i] = in.nextInt();
            }
            checkArray(values);
        }
    }

    private static void checkArray(int[] values) {
        int maxSofar = values[values.length - 1];
        List<Integer> leaders = new ArrayList<>();

        for (int i = values.length - 2; i >= 0; i--) {
            if (maxSofar <= values[i]) {
                leaders.add(values[i]);
                maxSofar = values[i];
            }
        }
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
        System.out.println();
    }

}
