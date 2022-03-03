package com.evan.dynamicprogramming.dp.cuttingRope;

import java.util.ArrayDeque;
import java.util.Deque;
//https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
public class Solution {
    private int max = 0;
    private Deque<Integer> deque;
    public int cuttingRope(int n) {
        findWay(n, new ArrayDeque<>());
        System.out.println(max+","+deque);
        return max;
    }

    private void findWay(int n, ArrayDeque<Integer> path) {
        if (n == 0) {
            int temp = getTotal(path);
            if(temp > max){
                max = temp;
                deque = new ArrayDeque<>(path);
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            path.addLast(i);
            findWay(n - i, path);
            path.removeLast();
        }
    }

    private int getTotal(ArrayDeque<Integer> deque){
        if(deque.size() <= 1) return 0;
        int total = 1;
        for (int value: deque){
            total *= value;
        }

        return total;
    }
}
