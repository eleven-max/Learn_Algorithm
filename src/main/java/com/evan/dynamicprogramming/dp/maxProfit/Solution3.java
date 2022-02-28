package com.evan.dynamicprogramming.dp.maxProfit;

import com.evan.dynamicprogramming.Common.CommonUtil;

//https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
public class Solution3 {

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        Solution3 solution3 = new Solution3();
        solution3.maxProfit(prices);
    }

    public int maxProfit(int[] prices) {
        if(null == prices || 0 == prices.length){
            return 0;
        }
        int[][] dp = new int[2][prices.length];
        dp[0][0] = prices[0];//min
        dp[1][0] = 0;//value
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[0][i] = Math.min(dp[0][i - 1], prices[i]);
            dp[1][i] = prices[i] - dp[0][i];
            max = Math.max(dp[1][i], max);
        }
//        CommonUtil.printMatrix(dp);
        return max;
    }
}
