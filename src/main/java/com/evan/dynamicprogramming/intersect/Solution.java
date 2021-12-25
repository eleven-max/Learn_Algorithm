package com.evan.dynamicprogramming.intersect;

import java.util.ArrayDeque;
import java.util.ArrayList;

//两个数组的交集 II
//https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] hash = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            hash[nums1[i]]++;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (hash[nums2[i]] > 0) {
                list.add(nums2[i]);
                hash[nums2[i]]--;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
