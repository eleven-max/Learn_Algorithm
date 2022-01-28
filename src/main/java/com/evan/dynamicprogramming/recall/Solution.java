package com.evan.dynamicprogramming.recall;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> results = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        find(n,n, "");
        return results;
    }

    private void find(int left, int right, String path){
        if(left == 0 && right == 0){
            results.add(path);
            return;
        }

        if(left > 0){
            find(left-1, right, path + "(");
        }

        if(left < right){
            find(left, right-1, path + ")");
        }
    }
}
