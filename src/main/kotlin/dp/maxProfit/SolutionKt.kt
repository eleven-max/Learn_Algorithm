package dp.maxProfit

class SolutionKt {

    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var preMin = prices[0]

        for (i in 1 until prices.size) {
            result = Math.max(result, prices[i] - preMin)
            preMin = Math.min(preMin, prices[i])
        }
        return result
    }
}