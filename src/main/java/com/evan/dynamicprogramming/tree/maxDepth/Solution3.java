package com.evan.dynamicprogramming.tree.maxDepth;


import com.evan.dynamicprogramming.Common.TreeNode;
//https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
public class Solution3 {

    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    private int depth(TreeNode node){
        if(node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}
