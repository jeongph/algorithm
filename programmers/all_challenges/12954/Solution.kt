class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()

        for (i in 1..n) {
            answer.add((x * i).toLong())
        }

        return answer.toLongArray()
    }
}

fun main() {
    val solution = Solution().solution(2, 5)
        .forEach { println(it) }
}