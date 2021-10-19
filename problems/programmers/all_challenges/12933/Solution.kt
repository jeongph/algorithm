class Solution {
    fun solution(n: Long): Long = n.toString()
        .toList()
        .sortedDescending()
        .let { list ->
            var temp = ""
            list.forEach { char ->
                temp += char
            }

            temp
        }.toLong()
}