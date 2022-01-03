package com.evan.dynamicprogramming.hash.MyHashMap;

import java.util.Arrays;
//https://leetcode-cn.com/problems/design-hashmap/
public class MyHashMap {

    private final int[] mapArray;
    public MyHashMap() {
        mapArray = new int[1000001];
        Arrays.fill(mapArray, -1);
    }

    public void put(int key, int value) {
        mapArray[key] = value;
    }

    public int get(int key) {
        return mapArray[key];
    }

    public void remove(int key) {
        mapArray[key] = -1;
    }
}
