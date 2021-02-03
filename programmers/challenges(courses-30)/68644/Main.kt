fun main() {
    val x = Solution().solution(intArrayOf(2, 1, 3, 4, 1))
    x.forEach {
        print("${it}, ")
    }
}

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var temp = mutableListOf<Int>()
        numbers.forEachIndexed { index, x ->
            numbers.forEachIndexed { index2, y ->
                if (index != index2) {
                    temp.add(x + y)
//                    println("${index} * ${index2} = ${x}, ${y}")
                }

            }
        }
        answer = temp.distinct().toIntArray()
        answer.sort()

        return answer
    }
}