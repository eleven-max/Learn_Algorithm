package com.evan.dynamicprogramming.dp.longestCommonSubsequence;

import com.evan.dynamicprogramming.Common.CommonUtil;

//https://leetcode-cn.com/problems/longest-common-subsequence/
public class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int row = 0; row < text1.length(); row++) {
            for (int col = 0; col < text2.length(); col++) {
                if (text1.charAt(row) == text2.charAt(col)) {
                    //取左上角的值+1
                    dp[row + 1][col + 1] = dp[row][col] + 1;
                } else {
                    dp[row + 1][col + 1] = Math.max(dp[row + 1][col], dp[row][col + 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
