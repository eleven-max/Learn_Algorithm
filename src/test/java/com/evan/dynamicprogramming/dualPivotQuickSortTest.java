package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.hash.dualPivotQuickSort.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class dualPivotQuickSortTest {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 3, 0};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);

        Solution solution = new Solution();
        solution.dualPivotQuickSort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expected));


        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);

        Solution solution = new Solution();
        solution.dualPivotQuickSort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expected));


        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void test3() {
        int[] nums = {0};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);

        Solution solution = new Solution();
        solution.dualPivotQuickSort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expected));


        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void test4() {
        int[] nums = {1, 0};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);

        Solution solution = new Solution();
        solution.dualPivotQuickSort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expected));


        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void test5() {
        int[] nums = {8, 10, 1, 2, 1, 5, 2, 3, 8, 9, 9, 4, 8, 8, 1, 5, 9, 2, 7, 2};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);

        Solution solution = new Solution();
        solution.dualPivotQuickSort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expected));


        Assertions.assertArrayEquals(expected, nums);
    }

}
