package com.evan.dynamicprogramming.tree.postorder;

import com.evan.dynamicprogramming.Common.Node;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
public class Solution {



    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    private void postorder(Node root, List<Integer> list){
        if(null == root) return;
        for (Node node: root.children){
            postorder(node, list);
        }
        list.add(root.val);
    }
}
