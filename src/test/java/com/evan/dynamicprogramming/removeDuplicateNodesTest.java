package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.Common.CommonUtil;
import com.evan.dynamicprogramming.Common.ListNode;
import com.evan.dynamicprogramming.removeDuplicateNodes.Solution;
import org.junit.jupiter.api.Test;

public class removeDuplicateNodesTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        ListNode head = CommonUtil.createList(new int[]{1,1,3,3,4});
        ListNode result = solution.removeDuplicateNodes(head);
        CommonUtil.printList(result);
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        ListNode head = CommonUtil.createList(new int[]{1,2,3,3,2,1});
        ListNode result = solution.removeDuplicateNodes(head);
        CommonUtil.printList(result);
    }

    @Test
    public void test3(){
        Solution solution = new Solution();
        ListNode head = CommonUtil.createList(new int[]{1,1,1,1,2});
        ListNode result = solution.removeDuplicateNodes(head);
        CommonUtil.printList(result);
    }
}
