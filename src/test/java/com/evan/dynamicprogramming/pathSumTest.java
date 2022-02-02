package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.Common.CommonUtil;
import com.evan.dynamicprogramming.Common.TreeNode;
import com.evan.dynamicprogramming.tree.pathSum.Solution;
import org.junit.jupiter.api.Test;

public class pathSumTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root = CommonUtil.createTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2,null, null, null, null, 5, 1}, 0);
        int target = 22;
        System.out.println(solution.pathSum(root, target));
    }
}
