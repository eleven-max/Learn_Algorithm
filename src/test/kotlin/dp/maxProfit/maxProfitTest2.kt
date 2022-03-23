package dp.maxProfit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class maxProfitTest2 {

    @Test
    fun test(){
        val solutionKt2 = SolutionKt2()
        val prices = intArrayOf(7,1,5,3,6,4)
        Assertions.assertEquals(7, solutionKt2.maxProfit(prices))
    }

    @Test
    fun test2(){
        val solutionKt2 = SolutionKt2()
        val prices = intArrayOf(1,2,3,4,5)
        Assertions.assertEquals(4, solutionKt2.maxProfit(prices))
    }

    @Test
    fun test3(){
        val solutionKt2 = SolutionKt2()
        val prices = intArrayOf(7,6,4,3,1)
        Assertions.assertEquals(0, solutionKt2.maxProfit(prices))
    }
}