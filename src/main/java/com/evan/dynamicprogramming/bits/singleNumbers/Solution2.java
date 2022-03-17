package com.evan.dynamicprogramming.bits.singleNumbers;

//https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
public class Solution2 {
    public int singleNumber(int[] nums) {
        int[] a = int2BinaryArray(nums[0]);
        for (int k = 1;k < nums.length;k ++){
            int[] b = int2BinaryArray(nums[k]);
            add2BitArray(a, b);
        }

        for (int i=0;i<32;i++){
            a[i] = a[i] % 3;
        }

        return binaryArray2Int(a);
    }

    private void add2BitArray(int[] a, int[] b){
        for (int i=0;i<32;i++){
            a[i] += b[i];
        }
    }

    private int[] int2BinaryArray(int num) {
        int[] bits = new int[32];

        for (int i = 0; i < 32; i++) {
            if ((1 << i & num) != 0) {
                bits[31 - i] = 1;
            }
        }

        return bits;
    }

    private int binaryArray2Int(int[] bits) {
        int r = 0;

        for (int i = 0; i < 32; i++) {
            if(bits[31 - i] == 1){
                r |= (1 << i);
            }
        }

        return r;
    }
}
