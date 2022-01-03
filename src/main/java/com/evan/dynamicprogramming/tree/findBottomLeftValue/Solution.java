package com.evan.dynamicprogramming.tree.findBottomLeftValue;

import com.evan.dynamicprogramming.Common.TreeNode;

//https://leetcode-cn.com/problems/find-bottom-left-tree-value/
public class Solution {

    private int maxDepth;
    private int leftValue;

    public int findBottomLeftValue(TreeNode root) {
        preorder(root, 0);
        return leftValue;
    }

    private void preorder(TreeNode root, int depth){
        if(null == root.left && null == root.right){
            if(depth > maxDepth){
                maxDepth = depth;
                leftValue = root.val;
            }
            return;
        }

        if(null != root.left){
            depth ++;
            preorder(root.left, depth);
            depth--;
        }

        if(null != root.right){
            depth ++;
            preorder(root.right, depth);
            depth--;
        }
    }
}
