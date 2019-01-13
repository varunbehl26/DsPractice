package com.company.misc;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0
public class StockBuySell {
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

        int lowIndex = 0, highIndex = 0;
        lowIndex = 0;
        highIndex = 1;


        while (lowIndex <= highIndex && highIndex < values.length) {
            if (values[highIndex] >= values[lowIndex]) {
                highIndex++;
            } else if (highIndex - lowIndex > 1) {
                System.out.print("(" + lowIndex + "," + --highIndex + ")");
                lowIndex = highIndex + 1;
                highIndex = highIndex + 2;
            } else {
                lowIndex++;
            }
        }
        if (highIndex - lowIndex > 1) {
            System.out.print(" ");
            System.out.println("(" + lowIndex + "," + --highIndex + ")");
        }

    }
}
