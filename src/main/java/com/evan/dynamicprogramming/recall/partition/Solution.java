package com.evan.dynamicprogramming.recall.partition;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/palindrome-partitioning/
public class Solution {

    private List<List<String>> results = new ArrayList<>();

    public List<List<String>> partition(String s) {
        findWay(s, 0, new ArrayList<>());
        return results;
    }

    private void findWay(String s, int index, List<String> path) {
        if (index >= s.length()) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); ++i) {
            String temp = s.substring(index, i + 1);
            if (isPalindrome(temp)) {
                path.add(temp);
                findWay(s, i + 1, path);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        if (null == s) return false;
        if (0 == s.length()) return false;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
