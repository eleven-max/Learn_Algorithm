package com.evan.dynamicprogramming.bits.swapNumbers;
//https://leetcode-cn.com/problems/swap-numbers-lcci/
public class Solution {

    public int[] swapNumbers(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        numbers[0] = a;
        numbers[1] = b;

        return numbers;
    }
}
