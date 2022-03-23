package dp.jump
//https://leetcode-cn.com/problems/jump-game-ii/
class SolutionKt {

    fun jump(nums: IntArray): Int {
        val dp = IntArray(nums.size){ Int.MAX_VALUE}
        val endI = dp.size - 1
        dp[0] = 0
        for (i in nums.indices){
            for (j in 1..nums[i]){
                if(i + j < nums.size){
                    dp[i+j] = Math.min(dp[i] + 1, dp[i+j])
                }
                if(dp[endI] != Int.MAX_VALUE){
                    return dp[endI]
                }
            }
        }
        return dp[endI]
    }
}