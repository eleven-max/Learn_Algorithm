package com.evan.dynamicprogramming.recall.subsetsWithDup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode-cn.com/problems/subsets-ii/
public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(null == nums || 0 == nums.length) return results;
        Arrays.sort(nums);
        findWay(nums, 0, new ArrayList<>());

        return results;
    }

    private void findWay(int[] nums, int index, List<Integer> path) {
        if (index == nums.length) {
            results.add(new ArrayList<>(path));
            return;
        }

        //no choice
        findWay(nums, nums.length, path);

        for (int i = index; i < nums.length; i++) {
            if(i> index && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            findWay(nums, i+1, path);
            path.remove(path.size() - 1);
        }
    }


}
