package dp.maxProfit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class maxProfitTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        val prices = intArrayOf(7,1,5,3,6,4)
        Assertions.assertEquals(5, solutionKt.maxProfit(prices))
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        val prices = intArrayOf(7,6,4,3,1)
        Assertions.assertEquals(0, solutionKt.maxProfit(prices))
    }
}