package com.evan.dynamicprogramming.tribonacci;
//https://leetcode-cn.com/problems/n-th-tribonacci-number/
//动态规划
public class Solution {

    public int tribonacci(int n) {
        //备忘录解法
        if(n <=0) return 0;
        if(n<3) return 1;

        int[] marks = new int[n + 1];
        marks[0] = 0;
        marks[1] = 1;
        marks[2] = 1;
        return tribonacci(n, marks);
    }

    private int tribonacci(int n, int[] marks){
        if(n == 0) return 0;
        if(marks[n] != 0){
            System.out.println(n+", return:"+marks[n]);
            return marks[n];
        }

        marks[n] = tribonacci(n-3,marks) + tribonacci(n-2, marks) + tribonacci(n-1, marks);

        return marks[n];
    }
}
