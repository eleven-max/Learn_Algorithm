package dp.isSubsequence

//https://leetcode-cn.com/problems/is-subsequence/
class SolutionKt {
    //双指针解法
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j < t.length) {
            if(s[i] == t[j]){
                i++
            }
            j++
        }

        return i == s.length
    }
}