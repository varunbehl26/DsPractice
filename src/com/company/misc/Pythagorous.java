package com.company.misc;


import java.util.Arrays;
import java.util.Scanner;

class Pythagorous {
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

            System.out.println(checkArray(values) ? "Yes" : "No");

        }
    }

    private static boolean checkArray(int[] values) {
        boolean hasTriplet = false;

        Arrays.sort(values);

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * values[i];
        }

        int c = values[values.length - 1];
        for (int i = values.length - 2; i > 2; i--) {

            int l = 0;
            int r = i - 1;

            while (l < r) {
                if (values[i] == values[l] + values[r]) {
                    return hasTriplet = true;
                }

                if (values[i] > values[l] + values[r]) {
                    l++;
                } else {
                    r--;
                }
            }


        }


        return hasTriplet;
    }
}
