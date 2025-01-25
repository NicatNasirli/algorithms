package algorithms.leetcode.topInterview150;

//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//On each day, you may decide to buy and/or sell the stock.
// You can only hold at most one share of the stock at any time.
// However, you can buy it then immediately sell it on the same day.
//Find and return the maximum profit you can achieve.
public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int maxProfit = 0;
        for (int i = 0; i + 1 < length; i++) {
            if (prices[i] < prices[i + 1]){
                maxProfit += (prices[i + 1] - prices[i]);
            }
        }
        return maxProfit;
    }
}
