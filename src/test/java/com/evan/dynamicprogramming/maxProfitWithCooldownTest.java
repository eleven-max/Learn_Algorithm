package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.dp.maxProfit.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class maxProfitWithCooldownTest {
    @Test
    public void test(){
        int[] prices = {1,2,3,0,2};
        Solution2 solution2 = new Solution2();
        Assertions.assertEquals(3, solution2.maxProfit(prices));
    }

    @Test
    public void test2(){
        int[] prices = {1};
        Solution2 solution2 = new Solution2();
        Assertions.assertEquals(0, solution2.maxProfit(prices));
    }

    @Test
    public void test3(){
        int[] prices = {1,2,3};
        Solution2 solution2 = new Solution2();
        Assertions.assertEquals(2, solution2.maxProfit(prices));
    }
}
