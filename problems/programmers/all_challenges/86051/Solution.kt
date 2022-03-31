class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1

        for(x in 1..9){
            if(numbers.contains(x)) continue
            else answer += x
        }

        return answer
    }
}

fun main() {
    val temp: Int = 4
}