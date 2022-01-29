package com.evan.dynamicprogramming.recall.combinationSum3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        findWay(k,n,0, 1, new ArrayList<>(), new boolean[11]);
        return results;
    }

    private void findWay(int k, int n, int count, int index, List<Integer> path, boolean[] marks) {
        if (count > n) {
            return;
        }
        if (count == n && path.size() == k) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < 10; i++) {
            if(marks[i]) continue;

            marks[i] = true;
            path.add(i);
            findWay(k, n, count+i, i, path, marks);
            marks[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
