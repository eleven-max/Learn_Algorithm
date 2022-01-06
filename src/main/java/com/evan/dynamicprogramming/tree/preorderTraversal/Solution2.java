package com.evan.dynamicprogramming.tree.preorderTraversal;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);

        while (!deque.isEmpty()) {
            TreeNode node = deque.removeFirst();
            list.add(node.val);
            if(null != node.right){
                deque.addFirst(node.right);
            }
            if(null != node.left){
                deque.addFirst(node.left);
            }
        }

        return list;
    }
}
