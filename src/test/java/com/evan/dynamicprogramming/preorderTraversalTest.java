package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.Common.CommonUtil;
import com.evan.dynamicprogramming.Common.TreeNode;
import com.evan.dynamicprogramming.tree.preorderTraversal.Solution2;
import org.junit.jupiter.api.Test;

import java.util.List;

public class preorderTraversalTest {

    @Test
    public void test() {
        TreeNode node = CommonUtil.createTree(new Integer[]{1,2,3,null, 4}, 0);
        Solution2 solution2 = new Solution2();
        List<Integer>  list = solution2.preorderTraversal(node);
        System.out.println(list);
    }
}
