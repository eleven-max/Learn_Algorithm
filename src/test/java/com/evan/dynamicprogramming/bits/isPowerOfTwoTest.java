package com.evan.dynamicprogramming.bits;

import com.evan.dynamicprogramming.bits.isPowerOfTwo.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isPowerOfTwoTest {
    @Test
    public void test(){
        Solution solution = new Solution();
        Assertions.assertEquals(true, solution.isPowerOfTwo(4));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        Assertions.assertEquals(true, solution.isPowerOfTwo(16));
    }

    @Test
    public void test3(){
        Solution solution = new Solution();
        Assertions.assertEquals(false, solution.isPowerOfTwo(7));
    }

    @Test
    public void test4(){
        Solution solution = new Solution();
        Assertions.assertEquals(false, solution.isPowerOfTwo(-2147483648));
    }


    @Test
    public void test5(){
        Solution solution = new Solution();
        Assertions.assertEquals(false, solution.isPowerOfTwo(-2147483646));
    }



}
