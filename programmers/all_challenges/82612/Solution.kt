class Solution {
    fun solution(price: Int, money: Int, count: Int) = let {
        var answer: Long = money.toLong()
        for (i in 1..count) {
            answer -= price * i
        }
        if (answer < 0) answer * -1
        else 0
    }
}

fun main() {
    println(Solution().solution(3, 20, 4))
}