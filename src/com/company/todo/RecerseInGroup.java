package com.company.todo;

//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0

import java.util.Scanner;

public class RecerseInGroup {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int length = in.nextInt();
            int pos = in.nextInt();
            int[] values = new int[length];
            for (int i = 0; i < length; i++) {
                values[i] = in.nextInt();
            }
            checkArray(values, pos);

            for (int value : values
            ) {
                System.out.println(value);
            }

        }
    }

    private static void checkArray(int[] values, int pos) {
        {
            int i = 0;
            while (i < pos && pos - i >= 2) {
                int temp = values[i];
                values[i] = values[pos - 1 - i];
                values[pos - 1 - i] = temp;
                i++;
            }
        }
        for (int j = pos; j < values.length; j++) {
            int temp = values[j];
            values[j] = values[values.length - j];
            values[values.length - j] = temp;
        }

    }


}