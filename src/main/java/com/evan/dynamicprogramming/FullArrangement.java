package com.evan.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字全排列
 */
public class FullArrangement {
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> all(List<Integer> nums) {
        backtrace(nums, nums.size(), new ArrayList<>());
        return results;
    }

    private void backtrace(List<Integer> nums, int step, List<Integer> path) {
        if (0 == step) {
            System.out.println(path);
            results.add(path);
            return;
        }

        List<Integer> nextList = new ArrayList<>();
        nextList.addAll(nums);

        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            path.add(num);
            nextList.remove(num);

            backtrace(nextList, step - 1, path);

            path.remove(path.size() - 1);
            nextList.add(num);
        }
    }
}
