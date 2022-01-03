package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.hash.CheckPermutation.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckPermutationTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        String s1 = "abc";
        String s2 = "ab";
        boolean expected = false;
        Assertions.assertEquals(expected, solution.CheckPermutation(s1, s2));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        String s1 = "abc";
        String s2 = "bad";
        boolean expected = false;
        Assertions.assertEquals(expected, solution.CheckPermutation(s1, s2));
    }

    @Test
    public void test3(){
        Solution solution = new Solution();
        String s1 = "abc";
        String s2 = "abc";
        boolean expected = true;
        Assertions.assertEquals(expected, solution.CheckPermutation(s1, s2));
    }

}
