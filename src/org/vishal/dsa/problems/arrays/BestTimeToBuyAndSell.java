package org.vishal.dsa.problems.arrays;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        int[] input = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(input));
    }
    
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
    
}
