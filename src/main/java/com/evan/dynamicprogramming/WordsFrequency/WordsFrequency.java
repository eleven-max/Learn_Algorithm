package com.evan.dynamicprogramming.WordsFrequency;
//https://leetcode-cn.com/problems/words-frequency-lcci/
import java.util.HashMap;

public class WordsFrequency {
    HashMap<String, Integer> map = new HashMap<>();
    public WordsFrequency(String[] book) {
        for(String word: book){
            if(map.containsKey(word)){
                int value = map.get(word);
                map.put(word, value+1);
            }else {
                map.put(word, 1);
            }
        }
    }

    public int get(String word) {
        Integer value = map.get(word);
        if(null == value) {
            return 0;
        }else {
            return value;
        }
    }
}
