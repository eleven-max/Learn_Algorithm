package com.evan.dynamicprogramming.tree.preorderTraversal;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;
    }

    private void preorderTraversal(TreeNode root, List<Integer> list) {
        if(null == root){
            return;
        }

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
