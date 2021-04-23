class Solution {
    fun solution(s: String): String = s.toList()
        .sortedDescending()
        .let { list ->
            var temp = ""
            list.forEach {
                temp += it
            }

            temp
        }
}

fun main() {
    val ans = Solution().solution("Zbcdefg")
    println(ans)
}