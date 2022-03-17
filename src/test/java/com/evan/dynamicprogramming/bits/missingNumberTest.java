package com.evan.dynamicprogramming.bits;

import com.evan.dynamicprogramming.bits.missingNumber.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class missingNumberTest {
    @Test
    public void test(){
        Solution solution = new Solution();
        Assertions.assertEquals(2, solution.missingNumber(new int[]{3,0,1}));
    }

    @Test
    public void test1(){
        Solution solution = new Solution();
        Assertions.assertEquals(8, solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
