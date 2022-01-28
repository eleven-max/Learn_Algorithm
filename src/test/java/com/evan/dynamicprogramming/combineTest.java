package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.combine.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

public class combineTest {
    @Test
    public void test(){
        Solution solution = new Solution();
        List<List<Integer>> list = solution.combine(4, 2);
        System.out.println(list);
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        List<List<Integer>> list = solution.combine(1, 1);
        System.out.println(list);
    }
}
