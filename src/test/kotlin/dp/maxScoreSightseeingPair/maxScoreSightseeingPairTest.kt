package dp.maxScoreSightseeingPair

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class maxScoreSightseeingPairTest {

    @Test
    fun test(){
        val values = intArrayOf(8,1,5,2,6)
        val solutionKt = SolutionKt()
        Assertions.assertEquals(11, solutionKt.maxScoreSightseeingPair(values))
    }

    @Test
    fun test2(){
        val values = intArrayOf(1,2)
        val solutionKt = SolutionKt()
        Assertions.assertEquals(2, solutionKt.maxScoreSightseeingPair(values))
    }
}