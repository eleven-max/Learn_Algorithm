package dp.getRow

//https://leetcode-cn.com/problems/pascals-triangle-ii/
class SolutionKt {

    fun getRow(rowIndex: Int): List<Int> {
        val dp = mutableListOf<MutableList<Int>>()
        for (i in 0..rowIndex) {
            val list = MutableList(i+1){1}
            for (j in 0..i) {
                if(j == 0 || j == i){
                    list[j] = 1
                }else {
                    list[j] = dp[i-1][j-1] + dp[i-1][j]
                }
            }
            dp.add(list)
        }
        return dp[rowIndex]
    }
}

fun main(){
    val solutionKt = SolutionKt()
    for (i in 0..6){
        println(solutionKt.getRow(i))
    }

}