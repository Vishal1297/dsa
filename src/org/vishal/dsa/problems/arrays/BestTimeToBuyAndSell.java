package org.vishal.dsa.problems.arrays;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        int[] input = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(input));
    }
    
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices) {
            if (price < minprice)
                minprice = price;
            else if (price - minprice > maxprofit)
                maxprofit = price - minprice;
        }
        return maxprofit;
    }
    
}
