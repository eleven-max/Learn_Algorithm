package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.dp.maxProfit.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class maxProfitAndFeeTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        Assertions.assertEquals(8, solution.maxProfit(prices, fee));
    }
    @Test
    public void test2(){
        Solution solution = new Solution();
        int[] prices = {1,3,7,5,10,3};
        int fee = 3;
        Assertions.assertEquals(6, solution.maxProfit(prices, fee));
    }
}
