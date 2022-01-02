package com.evan.dynamicprogramming.relativeSortArray;
//https://leetcode-cn.com/problems/relative-sort-array/
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bitmap = new int[1001];
        for (int index : arr1) {
            bitmap[index]++;
        }

        int[] newArr1 = new int[arr1.length];
        int i = 0;
        for (int value : arr2) {
            while (bitmap[value] > 0) {
                newArr1[i++] = value;
                bitmap[value]--;
            }
        }

        if (i < newArr1.length) {
            for (int j = 0; j < bitmap.length; j++) {
                while (bitmap[j] > 0){
                    newArr1[i++] = j;
                    bitmap[j]--;
                }
            }
        }

        return newArr1;
    }
}
