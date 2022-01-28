package com.evan.dynamicprogramming.recall.letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private List<String> results = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(null == digits || 0 == digits.length()) return results;
        HashMap<Character, String> map = initMap();
        findWay(digits, 0, "", map);
        return results;
    }

    private void findWay(String digits, int step, String path, HashMap<Character, String> map) {
        if (digits.length() == path.length()) {
            results.add(path);
            return;
        }

        char c = digits.charAt(step);
        String chars = map.get(c);
        for (int i = 0; i < chars.length(); i++) {
            char temp = chars.charAt(i);
            findWay(digits, step+1, path+temp, map);
        }
    }

    private HashMap<Character, String> initMap() {
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");

        return hashMap;
    }
}
