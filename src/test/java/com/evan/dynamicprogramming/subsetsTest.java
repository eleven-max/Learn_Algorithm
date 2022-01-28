package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.subsets.Solution;
import org.junit.jupiter.api.Test;

public class subsetsTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{1,2,2}));

    }

    @Test
    public void test1(){
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{}));

    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{1}));

    }
}
