package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.fib.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fibTest {

    @Test
    public void case1(){
        Solution solution = new Solution();
        int n = 1;
        Assertions.assertEquals(1, solution.fib(n));
    }

    @Test
    public void case2(){
        Solution solution = new Solution();
        int n = 2;
        Assertions.assertEquals(1, solution.fib(n));
    }

    @Test
    public void case3(){
        Solution solution = new Solution();
        int n = 3;
        Assertions.assertEquals(2, solution.fib(n));
    }

    @Test
    public void case4(){
        Solution solution = new Solution();
        int n = 4;
        Assertions.assertEquals(3, solution.fib(n));
    }

    @Test
    public void case5(){
        Solution solution = new Solution();
        int n = 0;
        Assertions.assertEquals(0, solution.fib(n));
    }
}
