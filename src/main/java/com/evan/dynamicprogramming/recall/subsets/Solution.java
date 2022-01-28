package com.evan.dynamicprogramming.recall.subsets;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/subsets/
public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (null == nums || 0 == nums.length) return results;
//        results.add(new ArrayList<>());
        findWay(nums, 0, new ArrayList<>());
        return results;
    }

    private void findWay(int[] nums, int index, List<Integer> path) {
        if (index == nums.length) {
            results.add(new ArrayList<>(path));
            return;
        }

        //不选
        findWay(nums, nums.length, path);

        //可选列表中做选择
        for (int i = index; i < nums.length; i++) {
            int value = nums[i];
            path.add(value);
            findWay(nums, i+1, path);
            path.remove(path.size() - 1);
        }
    }

}
