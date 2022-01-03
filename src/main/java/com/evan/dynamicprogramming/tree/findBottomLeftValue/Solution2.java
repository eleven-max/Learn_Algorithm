package com.evan.dynamicprogramming.tree.findBottomLeftValue;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayDeque;

//https://leetcode-cn.com/problems/find-bottom-left-tree-value/
public class Solution2 {

    public int findBottomLeftValue(TreeNode root) {
        int leftValue = 0;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.removeFirst();
                if(0 == i){
                    leftValue = node.val;
                }
                if(null != node.left){
                    deque.addLast(node.left);
                }
                if(null != node.right){
                    deque.addLast(node.right);
                }
            }
        }

        return leftValue;
    }
}
