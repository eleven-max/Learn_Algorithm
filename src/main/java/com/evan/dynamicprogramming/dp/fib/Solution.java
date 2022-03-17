package com.evan.dynamicprogramming.dp.fib;

public class Solution {
    public int fib(int n) {
        if(0 == n) return 0;
        if (1 == n) return 1;

        Integer[] mark = new Integer[n+1];
        mark[0] = 0;
        mark[1] = 1;

        return findWay(n, mark);
    }

    private int findWay(int n, Integer[] mark){
        if(mark[n] != null){
            return mark[n];
        }
        mark[n] = findWay(n-1, mark) + findWay(n - 2, mark);
        return mark[n];
    }
}
