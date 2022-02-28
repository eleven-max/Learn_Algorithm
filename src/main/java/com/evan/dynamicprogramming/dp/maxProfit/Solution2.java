package com.evan.dynamicprogramming.dp.maxProfit;

import com.evan.dynamicprogramming.Common.CommonUtil;

//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
public class Solution2 {

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0]; //持有一支股票
        dp[0][1] = 0;//处于冷冻期
        dp[0][2] = 0;//不持有股票，不在冷冻期
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]);
        }
//        CommonUtil.printMatrix(dp);
        return Math.max(dp[prices.length-1][1], dp[prices.length-1][2]);
    }
}
