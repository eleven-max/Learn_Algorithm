package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.Common.TreeNode;
import com.evan.dynamicprogramming.tree.buildTree.Solution;
import org.junit.jupiter.api.Test;

public class buildTreeTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        TreeNode root = solution.buildTree(inorder, postorder);
        System.out.println(root);
    }
}
