package com.evan.dynamicprogramming.tree.buildTree;

import com.evan.dynamicprogramming.Common.TreeNode;

//https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (null == inorder || 0 == inorder.length ||
                null == postorder || 0 == postorder.length) return null;

        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;

        int rootValue = postorder[postEnd];
        int index = findNum(inorder, rootValue);
        int leftLength = index - inStart;

        TreeNode root = new TreeNode(rootValue);
        root.left = build(inorder, inStart, index - 1, postorder, postStart, postStart + leftLength -1);
        root.right = build(inorder, index + 1, inEnd, postorder, postStart + leftLength, postEnd - 1);

        return root;
    }

    private int findNum(int[] order, int target) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
