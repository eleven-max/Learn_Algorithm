package dp.minDistance

//https://leetcode-cn.com/problems/edit-distance/
class SolutionKt {

    fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word1.length + 1) { IntArray(word2.length + 1) { 0 } }
        // 第一行
        for (i in 0 until dp[0].size){
            dp[0][i] = i
        }
        for (j in dp.indices){
            dp[j][0] = j
        }

        for (i in 1 .. word1.length){
            val c1 = word1[i-1]
            for (j in 1 .. word2.length){
                val c2 = word2[j-1]
                if(c1 == c2){
                    dp[i][j] = dp[i-1][j-1]
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1
                }
            }
        }

        return dp[word1.length][word2.length]
    }
}