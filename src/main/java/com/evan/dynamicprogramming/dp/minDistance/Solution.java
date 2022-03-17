package com.evan.dynamicprogramming.dp.minDistance;

import com.evan.dynamicprogramming.Common.CommonUtil;

//https://leetcode-cn.com/problems/edit-distance/
public class Solution {

    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int r = 0; r < dp.length; r++) {
            dp[r][0] = r;
        }

        for (int col = 0; col < dp[0].length; col++) {
            dp[0][col] = col;
        }

        for (int i = 0; i < word1.length(); i++) {
            char o = word1.charAt(i);
            int x = i+1;
            for (int j = 0; j < word2.length(); j++) {
                char t = word2.charAt(j);
                int y = j+1;
                if (o == t) {
                    dp[x][y] = dp[x-1][y-1];
                }else {
                    dp[x][y] = Math.min(Math.min(dp[x][y-1], dp[x-1][y]), dp[x-1][y-1])+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
