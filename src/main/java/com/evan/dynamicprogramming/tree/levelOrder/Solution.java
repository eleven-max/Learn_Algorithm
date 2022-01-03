package com.evan.dynamicprogramming.tree.levelOrder;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

//https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
public class Solution {


    public int[] levelOrder(TreeNode root) {
        if(null == root) return new int[0];

        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()){
            TreeNode node = deque.removeFirst();
            list.add(node.val);

            if(node.left != null){
                deque.addLast(node.left);
            }
            if(node.right != null){
                deque.addLast(node.right);
            }
        }

        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }
}
