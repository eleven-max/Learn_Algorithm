package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.recall.restoreIpAddresses.Solution;
import org.junit.jupiter.api.Test;

public class restoreIpAddressesTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        String s = "0000";
        System.out.println(solution.restoreIpAddresses(s));
    }

    @Test
    public void test1(){
        Solution solution = new Solution();
        String s = "25525511135";
        System.out.println(solution.restoreIpAddresses(s));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        String s = "0000";
        System.out.println(solution.restoreIpAddresses(s));
    }

    @Test
    public void test3(){
        Solution solution = new Solution();
        String s = "010010";
        System.out.println(solution.restoreIpAddresses(s));
    }

    @Test
    public void test4(){
        Solution solution = new Solution();
        String s = "101023";
        System.out.println(solution.restoreIpAddresses(s));
    }


}
