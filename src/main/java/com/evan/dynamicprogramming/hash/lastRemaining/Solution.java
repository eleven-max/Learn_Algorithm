package com.evan.dynamicprogramming.hash.lastRemaining;

public class Solution {


    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        boolean left2Right = true;
        while (n > 1){
            if(left2Right || n %2 == 1){
                head = head + step;
            }
            left2Right = !left2Right;
            step = step * 2;
            n = n /2;
        }
        return head;
    }

    public int lastRemaining1(int n) {

        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i-1] = i;
        }
//        System.out.println(Arrays.toString(nums));
        boolean left2right = true;
        while (nums.length > 1){
            if(left2right){
                nums = left2RightPass1(nums);
            }else {
                nums = right2LeftPass1(nums);
            }
//            System.out.println(left2right + ", "+Arrays.toString(nums));
            left2right = !left2right;
        }

        return nums[0];
    }

    private int[] left2RightPass1(int[] nums) {
        if (null == nums || nums.length < 2) return nums;

        int[] copy = new int[nums.length / 2];
        int index = 0;
        int p = 0;
        while (p <= nums.length - 1) {
            if ((p & 1) == 1) {
                copy[index++] = nums[p];
            }
            p++;
        }

        return copy;
    }

    private int[] right2LeftPass1(int[] nums) {
        if (null == nums || nums.length < 2) return nums;
        int[] copy = new int[nums.length / 2];
        int index = copy.length - 1;
        int p = nums.length - 1;
        p = p - 1;
        while (p >= 0) {
            copy[index--] = nums[p];
            p = p - 2;
        }

        return copy;
    }
}
