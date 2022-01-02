package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.lastRemaining.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class lastRemainingTest {

    @Test
    public void test(){
        Solution solution = new Solution();

        int n = 9;
        int expected = 6;
        Assertions.assertEquals(expected, solution.lastRemaining(n));
    }


    @Test
    public void test2(){
        Solution solution = new Solution();

        int n = 1;
        int expected = 1;
        Assertions.assertEquals(expected, solution.lastRemaining(n));
    }

    @Test
    public void test3(){
        Solution solution = new Solution();

        int n = 2;
        int expected = 2;
        Assertions.assertEquals(expected, solution.lastRemaining(n));
    }
}
