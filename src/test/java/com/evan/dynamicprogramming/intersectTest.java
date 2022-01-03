package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.hash.intersect.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class intersectTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
