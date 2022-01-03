package com.evan.dynamicprogramming.tree.levelOrder;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
public class Solution2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(null == root) return list;

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            ArrayDeque<TreeNode> temp = new ArrayDeque<>();

            while (!deque.isEmpty()){
                TreeNode node = deque.removeFirst();
                level.add(node.val);

                if(null != node.left){
                    temp.add(node.left);
                }
                if(null != node.right){
                    temp.add(node.right);
                }
            }

            list.add(level);
            deque.addAll(temp);
        }

        return list;
    }
}
