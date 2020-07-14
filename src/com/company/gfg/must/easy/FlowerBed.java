package com.company.gfg.must.easy;

public class FlowerBed {

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int start;
        int mid = -1;
        int end = -1;

        for (int i = 1; i < flowerbed.length - 1; i++) {
            start = flowerbed[i - 1];
            mid = flowerbed[i];
            end = flowerbed[i + 1];

            if (start == 0 && mid == 0) {
                n--;
                i++;
            }
        }
        end = flowerbed[flowerbed.length - 1];
        if (end == 0 && mid == 0) {
            n--;
        }
        return n == 0;
    }

}
