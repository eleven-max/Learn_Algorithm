package com.evan.dynamicprogramming.hash.search;

//https://leetcode-cn.com/problems/binary-search/
public class Solution {

    public int search(int[] nums, int target) {
        if (null == nums || 0 == nums.length) return -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
