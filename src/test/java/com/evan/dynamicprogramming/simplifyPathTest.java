package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.simplifyPath.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class simplifyPathTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        String s = "/home/";
        String exptectd = "/home";
        Assertions.assertEquals(exptectd, solution.simplifyPath(s));
    }

    @Test
    public void test1(){
        Solution solution = new Solution();
        String s = "/../";
        String exptectd = "/";
        Assertions.assertEquals(exptectd, solution.simplifyPath(s));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        String s = "/home//foo/";
        String exptectd = "/home/foo";
        Assertions.assertEquals(exptectd, solution.simplifyPath(s));
    }


    @Test
    public void test3(){
        Solution solution = new Solution();
        String s = "/a/./b/../../c/";
        String exptectd = "/c";
        Assertions.assertEquals(exptectd, solution.simplifyPath(s));
    }

}
