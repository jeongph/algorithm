class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()

        var temp = mutableListOf<Int>()
        commands.forEach { cmd -> // [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
            answer.add(array.copyOfRange(cmd[0]-1, cmd[1]).sorted()[cmd[2]-1])
        }

        return answer.toIntArray()
    }
}