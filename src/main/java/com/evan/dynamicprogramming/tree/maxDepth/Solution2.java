package com.evan.dynamicprogramming.tree.maxDepth;

import com.evan.dynamicprogramming.Common.Node;

import java.util.ArrayDeque;

public class Solution2 {

    public int maxDepth(Node root) {
        if (null == root) return 0;

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(root);
        int depth = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            depth++;
            for (int i = 0; i < size; i++) {
                Node node = deque.removeFirst();
                if(null != node.children && node.children.size() > 0){
                    int childrenSize = node.children.size();
                    for(int j=0;j<childrenSize;j++){
                        deque.addLast(node.children.get(j));
                    }
                }
            }
        }
        return depth;
    }
}
