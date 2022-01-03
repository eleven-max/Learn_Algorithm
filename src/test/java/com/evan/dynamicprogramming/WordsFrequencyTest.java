package com.evan.dynamicprogramming;

import com.evan.dynamicprogramming.hash.WordsFrequency.WordsFrequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordsFrequencyTest {

    @Test
    public void test(){
        String[] words = {"i", "have", "an", "apple", "he", "have", "a", "pen"};
        WordsFrequency wordsFrequency = new WordsFrequency(words);

        Assertions.assertEquals(0, wordsFrequency.get("you"));
        Assertions.assertEquals(2, wordsFrequency.get("have"));
        Assertions.assertEquals(1, wordsFrequency.get("an"));
    }
}
