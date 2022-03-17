package com.evan.dynamicprogramming.bits.missingNumber;

public class Solution {

    public int missingNumber(int[] nums) {
        int p = 0;
        for (int i = 0; i <= nums.length; i++) {
            p ^= i;
        }
        for(int value: nums){
            p ^= value;
        }

        return p;
    }
}
