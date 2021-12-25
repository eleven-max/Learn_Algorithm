package com.evan.dynamicprogramming.canjump;

//https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvb8zs/
public class Solution {


    public boolean canJump(int[] nums) {
        if (nums == null || 0 == nums.length) return false;

        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        int[] mark = new int[nums.length];
        if(nums[0] > 0) mark[0]++;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if(i+j < nums.length){
                    mark[i + j]++;
                }
            }
        }

        for (int i = 0; i < mark.length; i++) {
            if(i == mark.length -1 && mark[i] > 0) return true;
            if(mark[i] == 0) return false;
        }
        return false;
    }
}
