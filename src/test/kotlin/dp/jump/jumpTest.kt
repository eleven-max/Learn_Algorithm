package dp.jump

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class jumpTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        val array = intArrayOf(2,3,1,1,4)
        Assertions.assertEquals(2,solutionKt.jump(array))
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        val array = intArrayOf(2,3,0,1,4)
        Assertions.assertEquals(2,solutionKt.jump(array))
    }
}