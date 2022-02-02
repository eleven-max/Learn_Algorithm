package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.partition.Solution;
import org.junit.jupiter.api.Test;

public class partitionTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        String s = "aab";
        System.out.println(solution.partition(s));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        String s = "a";
        System.out.println(solution.partition(s));
    }

    @Test
    public void test3(){
        Solution solution = new Solution();
        String s = "abcdda";
        System.out.println(solution.partition(s));
    }
}
