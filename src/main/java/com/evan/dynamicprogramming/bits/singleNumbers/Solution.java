package com.evan.dynamicprogramming.bits.singleNumbers;

//https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
public class Solution {
    public int[] singleNumbers(int[] nums) {
        //将全部数字异或
        int total = 0;
        for (int i : nums) {
            total ^= i;
        }

        //从右到左，找到total二进制第一个为1的下标
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if (((1 << i) & total) != 0) {
                index = i;
                break;
            }
        }
        int a = 0, b = 0;

        //根据第一个为1的位置做划分，将数组里的数字分为两组
        for (int i : nums) {
            if(((1 << index) & i) != 0){
                a ^= i;
            }else {
                b ^= i;
            }
        }

        return new int[]{a, b};
    }
}
