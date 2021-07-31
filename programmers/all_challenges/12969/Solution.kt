fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (line in 0..b) {
        for (star in 0..a)
            print("*")
        println()
    }
}
