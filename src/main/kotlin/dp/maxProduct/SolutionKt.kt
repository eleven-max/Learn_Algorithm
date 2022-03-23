package dp.maxProduct

import kotlin.math.min

//https://leetcode-cn.com/problems/maximum-product-subarray/
class SolutionKt {

    fun maxProduct(nums: IntArray): Int {
        var minR = nums[0]
        var maxR = nums[0]
        var result = nums[0]
        for (i in 1 until nums.size) {
            if(nums[i] < 0){
                val temp = minR
                minR = maxR
                maxR = temp
            }

            minR = Math.min(nums[i] * minR, nums[i])
            maxR = Math.max(nums[i] * maxR, nums[i])
            result = Math.max(Math.max(minR,maxR), result)
        }
        return result
    }
}