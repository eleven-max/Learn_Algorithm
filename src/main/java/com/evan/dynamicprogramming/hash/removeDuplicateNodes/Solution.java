package com.evan.dynamicprogramming.hash.removeDuplicateNodes;

import com.evan.dynamicprogramming.Common.ListNode;

import java.util.HashSet;

public class Solution {

    public ListNode removeDuplicateNodes(ListNode head) {
        if(null == head || null == head.next) return head;
        HashSet<Integer> set = new HashSet<>();

        ListNode p = head;
        ListNode q = p.next;

        set.add(p.val);

        while (p.next != null){
            if(set.contains(q.val)){
                //delete
                p.next = q.next;
                q = p.next;
            }else {
                set.add(q.val);

                p = q;
                q = q.next;
            }
        }

        return head;
    }
}
