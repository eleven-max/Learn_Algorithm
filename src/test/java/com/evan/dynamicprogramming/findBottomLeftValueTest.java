package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.Common.CommonUtil;
import com.evan.dynamicprogramming.Common.TreeNode;
import com.evan.dynamicprogramming.tree.findBottomLeftValue.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class findBottomLeftValueTest {

    @Test
    public void test(){
        TreeNode root = CommonUtil.createTree(new int[]{1,2,3}, 0);
        Solution2 solution2 = new Solution2();
        Assertions.assertEquals(2, solution2.findBottomLeftValue(root));
    }
}
