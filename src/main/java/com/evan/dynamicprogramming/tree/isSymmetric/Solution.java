package com.evan.dynamicprogramming.tree.isSymmetric;

import com.evan.dynamicprogramming.Common.TreeNode;

//https://leetcode-cn.com/problems/symmetric-tree/
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode root1, TreeNode root2){
        if(null == root1 && null == root2) return true;
        if(null == root1 || null == root2) return false;

        return (root1.val == root2.val) && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}
