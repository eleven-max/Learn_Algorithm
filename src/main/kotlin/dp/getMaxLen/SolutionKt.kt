package dp.getMaxLen

//https://leetcode-cn.com/problems/maximum-length-of-subarray-with-positive-product/
class SolutionKt {

    fun getMaxLen(nums: IntArray): Int {
        val positive = IntArray(nums.size) { 0 }
        val negative = IntArray(nums.size) { 0 }
        if (nums[0] > 0) {
            positive[0] = 1
        } else if(nums[0] < 0){
            negative[0] = 1
        }

        var result = positive[0]
        for (i in 1 until nums.size) {
            if (nums[i] > 0) {
                positive[i] = positive[i-1] + 1
                negative[i] = if(negative[i-1] > 0) negative[i-1] + 1 else 0
            }else if(nums[i] < 0){
                positive[i] = if(negative[i-1] > 0) negative[i-1] + 1 else 0
                negative[i] = if(positive[i-1] > 0) positive[i-1] + 1 else 1
            }

            result = Math.max(result, positive[i])
        }

        return result
    }
}