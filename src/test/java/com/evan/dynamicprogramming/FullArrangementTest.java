package com.evan.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FullArrangementTest {

    @Test
    public void test(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        FullArrangement fullArrangement = new FullArrangement();
        fullArrangement.all(nums);
    }
}
