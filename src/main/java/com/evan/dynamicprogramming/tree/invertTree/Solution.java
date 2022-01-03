package com.evan.dynamicprogramming.tree.invertTree;

import com.evan.dynamicprogramming.Common.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if(null == root) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }
}
