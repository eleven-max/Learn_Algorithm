package com.evan.dynamicprogramming.lengthOfLIS;

import sun.applet.Main;

import java.util.Arrays;

//https://leetcode-cn.com/problems/longest-increasing-subsequence/
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        return result;
    }
}
