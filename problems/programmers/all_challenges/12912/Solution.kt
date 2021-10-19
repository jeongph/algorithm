import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        for (cnt in max(a, b) downTo min(a, b)) {
            answer += cnt
        }

        return answer
    }
}
