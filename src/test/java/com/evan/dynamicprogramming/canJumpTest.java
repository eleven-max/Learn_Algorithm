package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.hash.canjump.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class canJumpTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int[] nums = {1};
        Assertions.assertEquals(true, solution.canJump(nums));
    }


    @Test
    public void case2() {
        Solution solution = new Solution();
        int[] nums = {3,2,1,0,4};
        Assertions.assertEquals(false, solution.canJump(nums));
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        int[] nums = {2,3,1,1,4};
        Assertions.assertEquals(true, solution.canJump(nums));
    }

}
