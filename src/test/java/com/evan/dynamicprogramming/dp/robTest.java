package com.evan.dynamicprogramming.dp;

import com.evan.dynamicprogramming.dp.rob.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class robTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        int[] nums = {1,2,3,1};
        Assertions.assertEquals(4,solution.rob(nums));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        int[] nums = {2,7,9,3,1};
        Assertions.assertEquals(12,solution.rob(nums));
    }
}
