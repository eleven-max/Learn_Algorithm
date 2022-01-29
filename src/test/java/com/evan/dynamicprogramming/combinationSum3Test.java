package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.combinationSum3.Solution;
import org.junit.jupiter.api.Test;

public class combinationSum3Test {

    @Test
    public void test(){
        Solution solution = new Solution();
        int k = 3;
        int n = 7;
        System.out.println(solution.combinationSum3(k, n));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        int k = 3;
        int n = 9;
        System.out.println(solution.combinationSum3(k, n));
    }
}
