package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.combinationSum.Solution;
import org.junit.jupiter.api.Test;

public class combinationSumTest {

    @Test
    public void test(){
        int[] candidates = {2,3,6,7};
        int target = 7;
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(candidates, target));
    }
}
