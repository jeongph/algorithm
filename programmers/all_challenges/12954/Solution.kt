class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()

        for (i in 1..n) {
            answer.add(x.toLong() * i)
        }

        return answer.toLongArray()
    }
}