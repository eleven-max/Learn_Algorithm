package dp.coinChange

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class coinChangeTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        val coins = intArrayOf(1,2,5)
        val amount = 11
        val result = solutionKt.coinChange(coins, amount)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        val coins = intArrayOf(2)
        val amount = 3
        val result = solutionKt.coinChange(coins, amount)
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun test3(){
        val solutionKt = SolutionKt()
        val coins = intArrayOf(1)
        val amount = 0
        val result = solutionKt.coinChange(coins, amount)
        Assertions.assertEquals(0, result)
    }
}