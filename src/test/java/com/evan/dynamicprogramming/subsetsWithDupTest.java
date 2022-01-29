package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.subsetsWithDup.Solution;
import org.junit.jupiter.api.Test;

public class subsetsWithDupTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{0}));
    }

    @Test
    public void test1(){
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{1,2,3}));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{1,2,2}));
    }
}
