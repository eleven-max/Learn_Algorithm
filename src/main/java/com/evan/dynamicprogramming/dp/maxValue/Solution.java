package com.evan.dynamicprogramming.dp.maxValue;

//https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
public class Solution {

    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        //first row
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        //first column
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        //dp
        for (int r = 1; r < grid.length; r++) {
            for (int c = 1; c < grid[0].length; c++) {
                dp[r][c] = Math.max(dp[r][c - 1], dp[r - 1][c]) + grid[r][c];
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}
