package dp.maxScoreSightseeingPair
//https://leetcode-cn.com/problems/best-sightseeing-pair/
class SolutionKt {

    fun maxScoreSightseeingPair(values: IntArray): Int {
        var preMax = values[0] //前缀和最大值-》value[i]+i 的最大值
        var result = Int.MIN_VALUE
        for (i in 1 until values.size) {
            val nowV = values[i] - i
            result = Math.max(result, nowV + preMax)

            //更新前缀和最大值
            preMax = Math.max(preMax, values[i] + i)
        }
        return result
    }
}