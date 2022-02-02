package com.evan.dynamicprogramming.tree.listOfDepth;

import com.evan.dynamicprogramming.Common.ListNode;
import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//https://leetcode-cn.com/problems/list-of-depth-lcci/
public class Solution {

    public ListNode[] listOfDepth(TreeNode tree) {
        if (null == tree) {
            return null;
        }
        List<ListNode> results = traversalTree(tree);
        ListNode[] array = results.toArray(new ListNode[results.size()]);
        return array;
    }

    private List<ListNode> traversalTree(TreeNode root) {
        List<ListNode> list = new ArrayList<>();

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int size = deque.size();

            ListNode tempHead = new ListNode(0);
            ListNode tail = tempHead;

            for (int i = 0; i < size; i++) {
                TreeNode temp = deque.removeFirst();
                ListNode newNode = new ListNode(temp.val);
                tail.next = newNode;
                tail = tail.next;

                if (temp.left != null) {
                    deque.addLast(temp.left);
                }
                if (temp.right != null) {
                    deque.addLast(temp.right);
                }
            }
            list.add(tempHead.next);
        }

        return list;
    }
}
