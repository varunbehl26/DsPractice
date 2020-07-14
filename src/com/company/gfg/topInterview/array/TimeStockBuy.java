package com.company.gfg.topInterview.array;

public class TimeStockBuy {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int len = maxProfit(prices);

        for (int i = 0; i < len; i++) {
            System.out.println((prices[i]));
        }
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }


}
