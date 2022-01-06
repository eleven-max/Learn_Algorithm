package com.evan.dynamicprogramming.tree.mergeTrees;

import com.evan.dynamicprogramming.Common.TreeNode;
//https://leetcode-cn.com/problems/merge-two-binary-trees/
public class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(null == root2) return root1;
        if(null == root1) return root2;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
