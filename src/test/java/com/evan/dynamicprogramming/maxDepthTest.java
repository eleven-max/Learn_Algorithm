package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.Common.CommonUtil;
import com.evan.dynamicprogramming.Common.TreeNode;
import com.evan.dynamicprogramming.tree.maxDepth.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class maxDepthTest {
    @Test
    public void test(){
        TreeNode root = CommonUtil.createTree(new int[]{1}, 0);
        Solution solution = new Solution();
        Assertions.assertEquals(1, solution.maxDepth(root));
    }
}
