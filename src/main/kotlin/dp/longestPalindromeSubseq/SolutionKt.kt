package dp.longestPalindromeSubseq

import com.evan.dynamicprogramming.Common.CommonUtil

//https://leetcode-cn.com/problems/longest-palindromic-subsequence/
class SolutionKt {
    fun longestPalindromeSubseq(s: String): Int {
        val s2 = s.reversed()
        println(s2)
        return longestCommonSubsequence(s, s2)
    }

    private fun longestCommonSubsequence(text1: String, text2: String): Int {
        val dp = Array(text1.length + 1) { IntArray(text2.length + 1) { 0 } }
        for (i in 1..text1.length) {
            val c1 = text1[i - 1]
            for (j in 1..text2.length) {
                val c2 = text2[j - 1]
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j])
                }
            }
        }
        CommonUtil.printMatrix(dp)
        return dp[text1.length][text2.length]
    }
}

fun main(){
    val solutionKt = SolutionKt()
    val s = "bbbab"
    val r = solutionKt.longestPalindromeSubseq(s)
    println(r)
}