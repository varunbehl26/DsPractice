package com.company.arrays;

public class maxPrice {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2, 4, 1}));
    }

    private static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
