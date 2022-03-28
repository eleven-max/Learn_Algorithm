package dp.nthUglyNumber

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class nthUglyNumberTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        val n = 10
        Assertions.assertEquals(12, solutionKt.nthUglyNumber(n))
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        val n = 1
        Assertions.assertEquals(1, solutionKt.nthUglyNumber(n))
    }

    @Test
    fun test3(){
        val solutionKt = SolutionKt()
        val n = 1690
        Assertions.assertEquals(2123366400, solutionKt.nthUglyNumber(n))
    }
}