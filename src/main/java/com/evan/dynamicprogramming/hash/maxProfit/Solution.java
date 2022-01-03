package com.evan.dynamicprogramming.hash.maxProfit;

//https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
//股票买卖最佳时间
public class Solution {
    //从局部最优解推导出全局最优解
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
