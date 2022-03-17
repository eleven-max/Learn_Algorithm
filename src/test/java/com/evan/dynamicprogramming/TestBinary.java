package com.evan.dynamicprogramming;

import org.junit.jupiter.api.Test;

public class TestBinary {

    @Test
    public void test(){
        int i = 1^2^3;
        int j = 1^2;

        int r = i^j;
        System.out.println(r);
    }
}
