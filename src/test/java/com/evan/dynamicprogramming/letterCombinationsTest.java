package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.letterCombinations.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

public class letterCombinationsTest {
    @Test
    public void test(){
        Solution solution = new Solution();
        List<String> results = solution.letterCombinations("23");
        System.out.println(results);
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        List<String> results = solution.letterCombinations("5678");
        System.out.println(results);
    }
}
