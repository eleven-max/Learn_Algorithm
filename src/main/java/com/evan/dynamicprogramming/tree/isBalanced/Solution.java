package com.evan.dynamicprogramming.tree.isBalanced;

import com.evan.dynamicprogramming.Common.TreeNode;
//https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
public class Solution {

    public boolean isBalanced(TreeNode root) {
        if(null == root) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode node){
        if(node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}
