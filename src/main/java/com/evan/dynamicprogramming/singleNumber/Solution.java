package com.evan.dynamicprogramming.singleNumber;

import java.util.Arrays;

public class Solution {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int p = 0;
        int q = p + 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                return nums[p];
            } else {
                p = p + 2;
                q = p + 1;
            }
        }
        return nums[p];
    }
}
