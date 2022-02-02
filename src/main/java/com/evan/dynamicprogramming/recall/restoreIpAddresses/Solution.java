package com.evan.dynamicprogramming.recall.restoreIpAddresses;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/restore-ip-addresses/
public class Solution {
    private List<String> results = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        findWay(s, 0, new ArrayList<>());
        return results;
    }

    private void findWay(String s, int index, List<Integer> path) {
        if (path.size() == 4 && index < s.length()) {
            return;
        }

        if (path.size() == 4 && index == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(path.get(i));
                if (i != 3) {
                    sb.append(".");
                }
            }
            results.add(sb.toString());
            return;
        }

        if (index < s.length()) {
            int value = s.charAt(index) - '0';
            path.add(value);
            findWay(s, index + 1, path);
            path.remove(path.size() - 1);

            if (0 == value) { //前导0
                return;
            }
            //第二个数字
            if (index + 1 < s.length()) {
                value = value * 10 + s.charAt(index + 1) - '0';
                path.add(value);
                findWay(s, index + 2, path);
                path.remove(path.size() - 1);
            }

            //第三个数字
            if (index + 2 < s.length()) {
                value = value * 10 + s.charAt(index + 2) - '0';
                if(value > 255){
                    return;
                }
                path.add(value);
                findWay(s, index + 3, path);
                path.remove(path.size() - 1);
            }
        }
    }

}
