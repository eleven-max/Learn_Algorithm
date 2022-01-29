package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.permuteUnique.Solution;
import org.junit.jupiter.api.Test;

public class permuteUniqueTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(solution.permuteUnique(new int[]{1,1,2}));
    }
}
