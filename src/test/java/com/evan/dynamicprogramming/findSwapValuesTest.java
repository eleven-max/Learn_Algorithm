package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.findSwapValues.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class findSwapValuesTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] result = solution.findSwapValues(array1, array2);
        System.out.println(Arrays.toString(result));
    }


    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] array1 = {519, 886, 282, 382, 662, 4718, 258, 719, 494, 795};
        int[] array2 = {52, 20, 78, 50, 38, 96, 81, 20};
        int[] result = solution.findSwapValues(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
