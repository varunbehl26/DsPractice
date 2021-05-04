package com.company.arrays.easy;

//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class FinalPrices {

    public static int[] finalPrices(int[] prices) {
        int[] finalPrices = new int[prices.length];

        int j;
        for (int i = 0; i < finalPrices.length; i++) {
            j = i + 1;
            while (j < finalPrices.length) {
                if (prices[j] <= prices[i]) {
                    break;
                }
                j++;
            }
            if (j < finalPrices.length && prices[j] <= prices[i]) {
                finalPrices[i] = prices[i] - prices[j];
            } else {
                finalPrices[i] = prices[i];
            }
        }
        return finalPrices;
    }


    public static void main(String[] args) {
        int[] prices = {8, 7, 4, 2, 8, 1, 7, 7, 10, 1};
        int finalPrices[] = finalPrices(prices);

        for (int finalPrice : finalPrices) {
            System.out.print(finalPrice);
            System.out.print(", ");
        }

    }

}
