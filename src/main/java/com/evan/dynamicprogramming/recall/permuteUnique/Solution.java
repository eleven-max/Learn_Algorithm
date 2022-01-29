package com.evan.dynamicprogramming.recall.permuteUnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/permutations-ii/
public class Solution {

    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (null == nums || 0 == nums.length) return results;
        Arrays.sort(nums);
        boolean[] mark = new boolean[nums.length];
        findWay(nums, 0, new ArrayList<>(), mark);
        return results;
    }

    private void findWay(int[] nums, int index, List<Integer> path, boolean[] mark) {
        if (index == nums.length) {
            results.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (mark[i] || (i > 0 && nums[i] == nums[i - 1] && mark[i - 1])) {
                continue;
            }
            mark[i] = true;
            path.add(nums[i]);
            findWay(nums, index + 1, path, mark);
            mark[i] = false;
            path.remove(path.size() - 1);
        }
    }

}
