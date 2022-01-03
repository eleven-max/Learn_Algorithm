package com.evan.dynamicprogramming.tree.postorder;

import com.evan.dynamicprogramming.Common.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
public class Solution2 {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        if(null == root) return list;

        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.add(root);
        while (!stack.isEmpty()){
            Node node = stack.removeLast();
            list.addFirst(node.val);

            for(Node n: node.children){
                stack.addLast(n);
            }
        }
        return list;
    }
}
