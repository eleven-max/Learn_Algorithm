package com.evan.dynamicprogramming.findSwapValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};

    }

    public int[] findSwapValues(int[] array1, int[] array2) {
        int count1 = getCount(array1);
        int count2 = getCount(array2);
        int diffValue = count2 - count1;
        if((diffValue & 1) == 1){
            return new int[0];
        }

        HashSet<Integer> set1 = new HashSet<>();
        for (int v: array1){
            set1.add(v);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int v: array2){
            set2.add(v);
        }
        int[] result = new int[2];
        for (int a: set1){
            int b = (diffValue + a * 2)/2;
            if(set2.contains(b)){
                result[0] = a;
                result[1] = b;
                return result;
            }
        }

        return new int[0];
    }

    private int getCount(int[] array) {
        int count = 0;
        for (int v : array) {
            count += v;
        }
        return count;
    }
}
