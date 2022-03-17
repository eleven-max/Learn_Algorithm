package com.evan.dynamicprogramming.bits.isPowerOfTwo;

import com.evan.dynamicprogramming.Common.CommonUtil;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;

        int[] bits = int2bits(n);
        CommonUtil.printArray(bits);
        System.out.println(Integer.toBinaryString(n));

        int count = 0;
        for (int i=0;i<32;i++){
            if(bits[i] == 1){
                count++;
            }
            if(count >1){
                return false;
            }
        }
        return count == 1;
    }

    private int[] int2bits(int n) {
        int[] bits = new int[32];
        int k = 1;
        for (int i = 0; i < 32; i++) {
            if((k & n) != 0){
                bits[31 - i] = 1;
            }
            k = k << 1;
        }
        return bits;
    }
}
