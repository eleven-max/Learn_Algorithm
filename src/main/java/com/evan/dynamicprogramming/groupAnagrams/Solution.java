package com.evan.dynamicprogramming.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//https://leetcode-cn.com/problems/group-anagrams/
public class Solution {

    public static void main(String[] args) {
        String s = "";
        System.out.println(new Solution().getHash(s));
    }


    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String value : strs) {
            String hashKey = getHash(value);
            List<String> temp;
            if (hashMap.containsKey(hashKey)) {
                temp = hashMap.get(hashKey);
            } else {
                temp = new ArrayList<>();
            }
            temp.add(value);
            hashMap.put(hashKey, temp);
        }

        List<List<String>> result = new ArrayList<>();
        for(String key: hashMap.keySet()){
            result.add(hashMap.get(key));
        }

        return result;
    }

    //hash 值的计算不能通过将字符串中的char转化为数字相加来处理。
    //因为会出现不同的字母，最终加出来的hash值相同的情况
    private String getHash(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
