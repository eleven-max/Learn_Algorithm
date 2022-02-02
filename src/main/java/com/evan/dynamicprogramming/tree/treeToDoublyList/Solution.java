package com.evan.dynamicprogramming.tree.treeToDoublyList;

import com.evan.dynamicprogramming.Common.tree.Node;

//https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
public class Solution {
    private Node head;
    private Node tail;

    public Node treeToDoublyList(Node root) {
        if (null == root) return head;
        preorder(root);
        return head;
    }

    private void preorder(Node root) {
        Node left = root.left;
        Node right = root.right;

        if (null != left) {
            preorder(left);
        }

        insertNode(root);

        if (null != right) {
            preorder(right);
        }
    }

    private void insertNode(Node node) {

        node.left = null;
        node.right = null;

        if (null == head) {
            head = node;
            tail = node;
            head.left = tail;
            tail.right = head;
        } else {

            node.left = tail;
            tail.right = node;

            tail = tail.right;

            tail.right = head;
            head.left = tail;
        }
    }
}
