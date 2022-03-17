package com.evan.dynamicprogramming.dp.tribonacci;
//https://leetcode-cn.com/problems/n-th-tribonacci-number/
public class Solution {

    public int tribonacci(int n) {
//        T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
        if(0 == n) return 0;
        if(1 == n) return 1;
        if(2 == n) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i=3;i<=n;i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
