package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.hash.maxProfit.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class maxProfitTest {

    private static Solution solution;

    @BeforeAll
    public static void before(){
        solution = new Solution();
    }

    @Test
    public void test(){
        int[] prices = {7,1,5,3,6,4};
        int expected = 7;
        Assertions.assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void test2(){
        int[] prices = {7};
        int expected = 0;
        Assertions.assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void test3(){
        int[] prices = {1,2,3,4,5};
        int expected = 4;
        Assertions.assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void test4(){
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        Assertions.assertEquals(expected, solution.maxProfit(prices));
    }
}
