package com.evan.dynamicprogramming.simplifyPath;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public String simplifyPath(String path) {
        if (null == path || 0 == path.length()) return "";

        String[] strings = path.split("/");

        Deque<String> deque = new ArrayDeque<>();
        for (String s : strings) {
            if (".".equals(s)) {

            } else if ("..".equals(s)) {
                if(!deque.isEmpty())
                    deque.removeLast();
            } else if(!s.isEmpty()){
                deque.addLast(s);
            }
        }

        StringBuilder sb = new StringBuilder("/");
        while (!deque.isEmpty()){
            sb.append(deque.removeFirst());
            if(!deque.isEmpty()){
                sb.append("/");
            }
        }

        return sb.toString();
    }
}
