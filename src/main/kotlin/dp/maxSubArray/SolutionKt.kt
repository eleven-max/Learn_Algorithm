package dp.maxSubArray

class SolutionKt {

    fun maxSubArray(nums: IntArray): Int {

        val dp = IntArray(nums.size) { Int.MIN_VALUE }
        dp[0] = nums[0]
        var result = dp[0]
        for (i in 1 until nums.size) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i])
            result = Math.max(dp[i], result)
        }

        return result
    }
}