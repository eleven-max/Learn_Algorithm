package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.dp.minDistance.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class minDistanceTest {

    @Test
    public void test(){
        String word1 = "horse";
        String word2 = "ros";

        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.minDistance(word1, word2));
    }

    @Test
    public void test1(){
        String word1 = "intention";
        String word2 = "execution";

        Solution solution = new Solution();
        Assertions.assertEquals(5, solution.minDistance(word1, word2));
    }
}
