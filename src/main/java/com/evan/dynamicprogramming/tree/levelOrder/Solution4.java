package com.evan.dynamicprogramming.tree.levelOrder;

import com.evan.dynamicprogramming.Common.Node;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
//https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
public class Solution4 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();

        if (null == root) return list;

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node node = deque.removeFirst();
                temp.add(node.val);
                if (null != node.children && node.children.size() > 0) {
                    for (int j = 0; j < node.children.size(); j++) {
                        deque.addLast(node.children.get(i));
                    }
                }
            }

            list.add(temp);
        }

        return list;
    }
}
