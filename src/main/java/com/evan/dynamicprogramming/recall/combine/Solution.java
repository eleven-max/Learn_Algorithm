package com.evan.dynamicprogramming.recall.combine;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        findWay(n, k, 1, new ArrayList<>());
        return results;
    }

    private void findWay(int n, int k, int step, List<Integer> path) {
        if (path.size() == k) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = step; i <= n; i++) {
            path.add(i);
            findWay(n, k, i+1, path);
            path.remove(path.size() - 1);
        }
    }
}
