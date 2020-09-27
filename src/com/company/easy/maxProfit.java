package com.company.easy;


//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class maxProfit {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int numBefore = prices[0];
        int numAfter = -1;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < numBefore) {
                numBefore = prices[i];
            }
            if (i != prices.length - 1) {
                numAfter = prices[i + 1];
                if (numAfter < prices[i]) {
                    profit += prices[i] - numBefore;
                    numBefore = prices[i];
                }
            } else {
                profit += prices[i] - numBefore;
            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(arr));
    }

}
