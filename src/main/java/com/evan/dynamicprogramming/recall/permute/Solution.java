package com.evan.dynamicprogramming.recall.permute;

import java.util.ArrayList;
import java.util.List;
//https://leetcode-cn.com/problems/permutations/
public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return results;
        }
        findWay(nums, 0, new ArrayList<>());
        return results;
    }

    private void findWay(int[] nums, int step, List<Integer> path) {
        if (step == nums.length) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            findWay(nums, step+1, path);
            path.remove(path.size() - 1);
        }
    }

}
