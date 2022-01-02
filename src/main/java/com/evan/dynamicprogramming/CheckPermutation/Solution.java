package com.evan.dynamicprogramming.CheckPermutation;

import java.util.HashMap;
import java.util.Objects;

public class Solution {

    public boolean CheckPermutation(String s1, String s2) {
        if (null == s1 || null == s2) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }


        if(map1.size() != map2.size()){
            return false;
        }

        for(Character k: map1.keySet()){
            if(!Objects.equals(map1.get(k), map2.get(k))){
                return false;
            }
        }

        return true;
    }
}
