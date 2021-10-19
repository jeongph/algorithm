class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0

        a.forEachIndexed { index, i ->

            answer += a[index] * b[index]
        }

        return answer
    }
}

fun main() {
    val a = intArrayOf(1, 2, 3, 4)
    val b = intArrayOf(-3, -1, 0, 2)
    println(Solution().solution(a, b))
}