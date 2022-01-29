package com.evan.dynamicprogramming.recall.combinationSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//https://leetcode-cn.com/problems/combination-sum/
public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (null == candidates || 0 == candidates.length || 0 == target) {
            return results;
        }
        findWay(candidates, 0, target, 0, new ArrayList<>());
        return results;
    }

    private void findWay(int[] candidates, int index, int target, int count, List<Integer> path) {
        if (count > target) {
            return;
        }
        if (count == target) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            path.add(candidates[i]);
            findWay(candidates, i, target, count + candidates[i], path);
            path.remove(path.size() - 1);
        }
    }

}
