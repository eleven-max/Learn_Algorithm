package com.evan.dynamicprogramming.tree.maxDepth;

import com.evan.dynamicprogramming.Common.TreeNode;

//https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
public class Solution {
    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (null == root) return maxDepth;
        preorder(root, 1);
        return maxDepth;
    }

    private void preorder(TreeNode root, int depth) {
        if (null == root.left && null == root.right) {
            if (depth > maxDepth) {
                maxDepth = depth;
            }
            return;
        }

        if (null != root.left) {
            depth++;
            preorder(root.left, depth);
            depth--;
        }

        if (null != root.right) {
            depth++;
            preorder(root.right, depth);
            depth--;
        }
    }
}
