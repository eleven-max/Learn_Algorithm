package com.evan.dynamicprogramming.recall.combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/combination-sum-ii/
public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        boolean[] marks = new boolean[candidates.length];
        findWay(candidates, target, 0,0, marks, new ArrayList<>());
        return results;
    }

    private void findWay(int[] candidates, int target, int index, int count, boolean[] marks, List<Integer> path) {
        if (count > target) {
            return;
        }
        if (target == count) {
            results.add(new ArrayList<>(path));
            return;
        }


        for (int i = index; i < candidates.length; i++) {
            if(marks[i] || (i > 0 && candidates[i] == candidates[i-1] && !marks[i-1])){
                continue;
            }

            path.add(candidates[i]);
            marks[i] = true;
            findWay(candidates, target, i,count + candidates[i], marks, path);
            marks[i] = false;
            path.remove(path.size() - 1);
        }

    }


}
