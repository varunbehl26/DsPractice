package com.company.todo;

import java.util.Arrays;
import java.util.Scanner;

public class Trains {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int length = in.nextInt();
            int[] arrival = new int[length];
            int[] departure = new int[length];

            for (int i = 0; i < length; i++) {
                arrival[i] = in.nextInt();
            }
            for (int i = 0; i < length; i++) {
                departure[i] = in.nextInt();
            }
            checkForTrains(arrival, departure);
        }
    }

    private static void checkForTrains(int[] arrival, int[] departure) {
        //assuming train arrival is not sorted
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformsNeeded = 0;
        int maxPlatforms;


    }
}