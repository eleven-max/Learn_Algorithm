package dp.trap

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class trapTest {
    lateinit var solution: SolutionKt
    @BeforeAll
    fun before(){
        solution = SolutionKt()
    }

    @Test
    fun test(){
        val height = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)
        Assertions.assertEquals(6, solution.trap(height))
    }

    @Test
    fun test2(){
        val height = intArrayOf(4,2,0,3,2,5)
        Assertions.assertEquals(9, solution.trap(height))
    }

}