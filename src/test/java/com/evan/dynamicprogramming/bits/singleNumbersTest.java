package com.evan.dynamicprogramming.bits;

import com.evan.dynamicprogramming.Common.CommonUtil;
import com.evan.dynamicprogramming.bits.singleNumbers.Solution;
import com.evan.dynamicprogramming.bits.singleNumbers.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class singleNumbersTest {
    @Test
    public void test(){
        Solution solution = new Solution();
        int[] nums = {4,1,4,6};
        int[] results = solution.singleNumbers(nums);
        Arrays.sort(results);
        Assertions.assertArrayEquals(new int[]{1,6}, results);
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] results = solution.singleNumbers(nums);
        CommonUtil.printArray(results);
    }

    @Test
    public void test3(){
        Solution2 solution2 = new Solution2();
        int[] nums = {3,4,3,3};
        Assertions.assertEquals(4, solution2.singleNumber(nums));
    }

    @Test
    public void test4(){
        Solution2 solution2 = new Solution2();
        int[] nums = {9,1,7,9,7,9,7};
        Assertions.assertEquals(1, solution2.singleNumber(nums));
    }
}
