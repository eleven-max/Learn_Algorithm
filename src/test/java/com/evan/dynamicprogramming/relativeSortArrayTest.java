package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.relativeSortArray.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class relativeSortArrayTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] expected = {2,2,2,1,4,3,3,9,6,7,19};
        int[] result = solution.relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }
}
