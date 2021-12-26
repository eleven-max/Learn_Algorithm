package com.evan.dynamicprogramming.dualPivotQuickSort;

public class Solution {

    public void dualPivotQuickSort(int[] nums) {
        dualPivotQuickSort(nums, 0, nums.length - 1);
    }

    private void dualPivotQuickSort(int[] nums, int left, int right) {
        if (null == nums || 0 == nums.length) return;//常规性保护
        if (left > right) return;
        //算法第一步和第二步，选择两个轴，前轴P（start指向）；后轴Q（end指向）；
        int start = left;
        int end = right;
        int k = start + 1;

        //保证两个轴的相对大小，必须是第一个轴P小于等于第二个轴Q
        if (nums[start] > nums[end]) {
            swap(nums, start, end);
        }
        //第三步，处理待排序数组元素
        //k和end只要不相遇，说明待排序数组元素还没处理完
        while (k < end) {
            if (nums[k] < nums[left]) {
                //第一种情况：k指向元素值小于前轴P
                start++;
                swap(nums, k, start);
                k++;
            } else if (nums[k] > nums[right]) {
                //第二种情况：k指向元素值大于后轴Q
                end--;
                swap(nums, k, end);
            } else {
                //第三种情况，k右移即可
                k++;
            }
        }

        //第四步，恢复两个轴的相对位置
        swap(nums, start, left);
        swap(nums, end, right);

        //第五步，递归调用，分别处理左中右三个区域
        //处理左区域，<P
        dualPivotQuickSort(nums, left, start - 1);
        //中区域，P<= && <=Q
        dualPivotQuickSort(nums, start + 1, end - 1);
        //右区域，>Q
        dualPivotQuickSort(nums, end + 1, right);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
