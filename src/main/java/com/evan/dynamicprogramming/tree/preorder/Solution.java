package com.evan.dynamicprogramming.tree.preorder;

import com.evan.dynamicprogramming.Common.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    private void preorder(Node root, List<Integer> list){
        if(null == root) return;
        list.add(root.val);
        for(Node node: root.children){
            preorder(node, list);
        }
    }
}
