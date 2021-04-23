class Solution {
    fun solution(s: String): String = s.let {
        val count = it.count()

        if (count % 2 == 0) it.substring(count / 2 - 1, count / 2 + 1) // 짝
        else it.substring(count / 2, count / 2 + 1) // 홀
    }
}

fun main() {
    val ans = Solution().solution("abcdde") // d
//    val ans = Solution().solution("Zbcdefg") // d
    println(ans)
}