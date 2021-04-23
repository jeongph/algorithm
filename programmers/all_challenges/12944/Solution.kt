fun main() {
    val x = Solution().solution(intArrayOf(6, 10, 2))
//    x.forEach {
//        print("${it}, ")
//    }
}

class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0

        answer = arr.average().toDouble()

        return answer
    }
}