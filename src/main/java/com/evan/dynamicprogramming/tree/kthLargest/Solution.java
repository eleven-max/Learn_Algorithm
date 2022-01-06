package com.evan.dynamicprogramming.tree.kthLargest;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        return list.get(list.size() - k);
    }

    private void inorder(TreeNode root, List<Integer> list){
        if(null == root){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
