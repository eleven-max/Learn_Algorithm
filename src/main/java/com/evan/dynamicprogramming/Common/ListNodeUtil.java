package com.evan.dynamicprogramming.Common;

public class ListNodeUtil {

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

    public static void printList(ListNode root){
        while (null != root){
            System.out.print(root.val+"->");
            root = root.next;
        }
        System.out.println();
    }
}
