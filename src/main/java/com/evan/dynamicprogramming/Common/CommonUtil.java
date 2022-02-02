package com.evan.dynamicprogramming.Common;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonUtil {

    public static void printMatrix(char[][] matrix) {
        System.out.println("---------------------------");
        if (null == matrix) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("---------------------------");
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("---------------------------");
        if (null == matrix) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("---------------------------");
    }

    public static ListNode createList(int[] nums) {
        if (null == nums || 0 == nums.length) return null;
        ListNode node = new ListNode(nums[0]);
        ListNode temp = node;
        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        return node;
    }

    public static void printList(ListNode root) {
        if (null == root) {
            System.out.println("null");
        }
        while (null != root) {
            System.out.print(root.val + "->");
            root = root.next;
        }
        System.out.println();
    }

    public static TreeNode createTree(int[] nodeValues, int index) {
        if (null == nodeValues) return null;
        if (index >= nodeValues.length) return null;

        TreeNode node = new TreeNode(nodeValues[index]);
        node.left = createTree(nodeValues, index * 2 + 1);
        node.right = createTree(nodeValues, index * 2 + 2);
        return node;
    }

    public static TreeNode createTree(Integer[] nodeValues, int index) {
        if (null == nodeValues || index>= nodeValues.length ||
                null == nodeValues[index]) return null;

        TreeNode node = new TreeNode(nodeValues[index]);
        node.left = createTree(nodeValues, index * 2 + 1);
        node.right = createTree(nodeValues, index * 2 + 2);
        return node;
    }
}
