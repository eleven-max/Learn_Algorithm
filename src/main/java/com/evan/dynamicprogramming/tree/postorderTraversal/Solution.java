package com.evan.dynamicprogramming.tree.postorderTraversal;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    private void postorderTraversal(TreeNode root, List<Integer> list){
        if(null == root) return;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }
}
