package dp.longestPalindrome
//https://leetcode-cn.com/problems/longest-palindromic-substring/
class SolutionKt {

    fun longestPalindrome(s: String): String {
        var len = 0
        var r = ""
        for (i in s.indices){
            var left = i
            var right = i
            while (left-1 >= 0 && s[left-1] == s[i]){
                left--
            }
            while (right+1 <= s.length-1 && s[right+1] == s[i]){
                right++
            }
            while (left-1 >= 0 && right+1 <= s.length-1 && s[left-1] == s[right+1]){
                left--
                right++
            }
            if(right-left + 1 > len){
                len = right - left + 1
                r = s.substring(left, right+1)
            }
        }
        return r
    }
}

fun main(){
    val solutionKt = SolutionKt()
    val s = "cbbd"
    println(solutionKt.longestPalindrome(s))
}