package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.MyHashMap.MyHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

    @Test
    public void test(){
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(2,2);
        Assertions.assertEquals(1, myHashMap.get(1));
        Assertions.assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2,1);
        Assertions.assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        Assertions.assertEquals(-1, myHashMap.get(2));
    }
}
