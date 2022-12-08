package dp.lengthOfLIS

//https://leetcode-cn.com/problems/longest-increasing-subsequence/
class SolutionKt {

    fun lengthOfLIS(nums: IntArray): Int {
        val dp = IntArray(nums.size) { 1 }
        var r = Int.MIN_VALUE
        for (i in 0 until nums.size) {
            for (j in 0 until i) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1)
                }
            }
            r = Math.max(dp[i], r)
        }

        return r
    }
}