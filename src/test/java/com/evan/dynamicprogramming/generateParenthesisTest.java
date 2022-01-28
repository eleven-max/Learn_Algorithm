package com.evan.dynamicprogramming;

import org.junit.jupiter.api.Test;
import com.evan.dynamicprogramming.recall.Solution;

import java.util.List;

public class generateParenthesisTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        List<String> list = solution.generateParenthesis(3);
        System.out.println(list);
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        List<String> list = solution.generateParenthesis(1);
        System.out.println(list);
    }
}
