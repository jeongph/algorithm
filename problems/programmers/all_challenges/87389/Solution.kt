class Solution {
    fun solution(n: Int): Int {
        var answer: Int = n

        for( x in 1..n) {
            if( n%x == 1 && answer > x ) answer = x
        }

        return answer
    }
}

fun main() {
    val temp: Int = 4
}