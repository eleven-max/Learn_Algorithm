package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.dp.longestCommonSubsequence.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class longestCommonSubsequenceTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        String text1 = "abcde";
        String text2 = "ace";
        Assertions.assertEquals(3, solution.longestCommonSubsequence(text1, text2));
    }
}
