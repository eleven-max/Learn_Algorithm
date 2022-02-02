package com.evan.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
//字典树
public class TrieTree {
    public class TrieNode {
        public char data;
        public TrieNode[] children = new TrieNode[26];
        public boolean isEndingChar = false;

        public TrieNode(char data) {
            this.data = data;
        }
    }

    private TrieNode root = new TrieNode('/');

    public void insert(char[] text) {
        if (null == text || 0 == text.length) return;
        TrieNode p = root;
        for (int i = 0; i < text.length; ++i) {
            int index = text[i] - 'a';
            if (p.children[index] == null) {
                TrieNode newNode = new TrieNode(text[i]);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    public boolean find(char[] target) {
        TrieNode p = root;
        for (int i = 0; i < target.length; i++) {
            int index = target[i] - 'a';
            if (null == p.children[index]) {
                return false;
            }
            p = p.children[index];
        }
        if (p.isEndingChar == false) return false;
        else return true;
    }

    public void prefixMatch(char[] prefix) {
        TrieNode p = root;
        for (int i = 0; i < prefix.length; i++) {
            int index = prefix[i] - 'a';
            if (p.children[index] == null) {
                return;
            }
            p = p.children[index];
        }
        List<Character> path = new ArrayList<>();
        travelTree(p, prefix, path);
    }

    private void travelTree(TrieNode p, char[] prefix, List<Character> path) {
        path.add(p.data);
        if (p.isEndingChar) {
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            sb.append(path);
            System.out.println(sb.toString());
        }

        for (int i = 0; i < p.children.length; ++i) {
            if(p.children[i] != null){
                travelTree(p.children[i], prefix, path );
            }
        }
        path.remove(path.size() -1);
    }
}
