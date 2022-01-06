package com.evan.dynamicprogramming;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        doTest();
    }


    public static void doTest() {
        // 描述：给定两个很大的正整数，用数组A、B表示（A > B），求 A - B 的结果
        // 示例：100056789 - 98765 = 99958024
        int[] arrA = {1, 0, 0, 0, 5, 6, 7, 8, 9};
        int[] arrB = {9, 8, 7, 6, 5};
        int[] result = largeNumSub(arrA, arrB);
    }

    private static int[] largeNumSub(int[] arrA, int[] arrB) {
        //借位
        for (int i = arrA.length - 2; i >= 0; i--) {
            arrA[i + 1] += 10;
            arrA[i]--;
        }
        System.out.println(Arrays.toString(arrA));

        //相减
        int iA = arrA.length - 1;
        int iB = arrB.length - 1;
        while (iB >= 0) {
            arrA[iA] = arrA[iA--] - arrB[iB--];
        }
        System.out.println(Arrays.toString(arrA));

        //进位
        int temp = 0;
        for (int i = arrA.length - 1; i >= 0; i--) {
            int k = arrA[i] + temp;
            arrA[i] = k % 10;
            temp = k / 10;
        }
        System.out.println(Arrays.toString(arrA));
        return arrA;
    }
}
