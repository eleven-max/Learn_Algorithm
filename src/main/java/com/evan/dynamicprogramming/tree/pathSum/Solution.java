package com.evan.dynamicprogramming.tree.pathSum;

import com.evan.dynamicprogramming.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
public class Solution {
    private List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (null == root) return results;
        dfs(root, target, 0, new ArrayList<>());
        return results;
    }

    private void dfs(TreeNode root, int target, int nowSum, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (nowSum + root.val == target) {
                results.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }

        if (null != root.left) {
            dfs(root.left, target, nowSum + root.val, path);
        }
        if (null != root.right) {
            dfs(root.right, target, nowSum + root.val, path);
        }
        path.remove(path.size() - 1);
    }
}
