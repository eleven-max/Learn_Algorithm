package com.evan.dynamicprogramming;

import org.junit.jupiter.api.Test;

public class TrieTreeTest {

    @Test
    public void test(){
        TrieTree trieTree = new TrieTree();
        String[] strings = { "am", "hello","hi", "how", "here", "her"};
        for(String s: strings){
            trieTree.insert(s.toCharArray());
        }

        trieTree.prefixMatch("he".toCharArray());
    }
}
