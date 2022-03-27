package dp.wordBreak

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class wordBreakTest {

    lateinit var solutionKt: SolutionKt

    @BeforeAll
    fun before(){
        solutionKt = SolutionKt()
    }

    @Test
    fun test(){
        val s = "leetcode"
        val wordDict = listOf<String>("leet", "code")
        Assertions.assertEquals(true, solutionKt.wordBreak(s, wordDict))
    }

    @Test
    fun test2(){
        val s = "applepenapple"
        val wordDict = listOf<String>("apple", "pen")
        Assertions.assertEquals(true, solutionKt.wordBreak(s, wordDict))
    }

    @Test
    fun test3(){
        val s = "catsandog"
        val wordDict = listOf<String>("cats", "dog", "sand", "and", "cat")
        Assertions.assertEquals(false, solutionKt.wordBreak(s, wordDict))
    }

    @Test
    fun test4(){
        val s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
        val wordDict = listOf<String>("a", "aa", "aaa", "aaaa", "aaaaa")
        Assertions.assertEquals(false, solutionKt.wordBreak(s, wordDict))
    }
}