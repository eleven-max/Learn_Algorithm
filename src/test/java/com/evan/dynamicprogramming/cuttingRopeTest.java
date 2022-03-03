package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.dp.cuttingRope.Solution;
import com.evan.dynamicprogramming.dp.cuttingRope.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cuttingRopeTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        Assertions.assertEquals(36,solution.cuttingRope(10));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assertions.assertEquals(1,solution.cuttingRope(2));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assertions.assertEquals(1,solution.cuttingRope(5));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assertions.assertEquals(1,solution.cuttingRope(58));
    }

    @Test
    public void test5(){
        for(int i=2;i<=58;i++){
            System.out.println("----------------------------"+i);
            Solution solution = new Solution();
            solution.cuttingRope(i);
        }
    }

    @Test
    public void test6(){
        for(int i=2;i<=58;i++){
            Solution2 solution = new Solution2();
            System.out.println(i+"="+solution.cuttingRope(i));
        }
    }
}
