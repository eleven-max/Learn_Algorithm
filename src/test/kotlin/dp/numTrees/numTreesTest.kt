package dp.numTrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class numTreesTest {

    @Test
    fun test(){
        val solutionKt = SolutionKt()
        Assertions.assertEquals(1, solutionKt.numTrees(1))
    }

    @Test
    fun test2(){
        val solutionKt = SolutionKt()
        Assertions.assertEquals(2, solutionKt.numTrees(2))
    }

    @Test
    fun test3(){
        val solutionKt = SolutionKt()
        Assertions.assertEquals(5, solutionKt.numTrees(3))
    }
}