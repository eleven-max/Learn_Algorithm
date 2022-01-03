package com.evan.dynamicprogramming.tree.levelOrder;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
public class Solution3 {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list = new Solution3().reversal(list);
        System.out.println(list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (null == root) return list;

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        boolean left2Right = true;
        while (!deque.isEmpty()) {
            ArrayDeque<TreeNode> temp = new ArrayDeque<>();
            ArrayList<Integer> levelValue = new ArrayList<>();
            while (!deque.isEmpty()) {
                TreeNode node = deque.removeFirst();
                levelValue.add(node.val);

                if(null != node.left){
                    temp.addLast(node.left);
                }
                if(null != node.right){
                    temp.addLast(node.right);
                }
            }

            if(!left2Right){
                levelValue = reversal(levelValue);
            }

            list.add(levelValue);
            deque.addAll(temp);
            left2Right = !left2Right;
        }

        return list;
    }

    private ArrayList<Integer> reversal(ArrayList<Integer> list){
        if(null == list || list.size() < 2) return list;
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = list.size() -1;i>=0;i--){
            temp.add(list.get(i));
        }

        return temp;
    }
}
