package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.combinationSum2.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

public class combinationSum2Test {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> list = solution.combinationSum2(candidates, target);
        System.out.println(list);
    }

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] candidates = {2,5,2,1,2};
        int target = 5;

        List<List<Integer>> list = solution.combinationSum2(candidates, target);
        System.out.println(list);
    }
}
