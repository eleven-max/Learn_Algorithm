package com.evan.dynamicprogramming.dp.cuttingRope;

//https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
public class Solution2 {
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;

        int temp = 1;
        while (n >= 3) {
            n = n - 3;
            temp = temp * 3;
            if(n == 4){
                break;
            }
        }

        if(n == 4) return temp * 4;

        while (n >= 2){
            n = n - 2;
            temp = temp * 2;
        }

        return temp;
    }
}
