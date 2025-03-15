fun main(args: Array<String>) {

    // Map 1 (0ne)
    val count = mapOf(Pair(1,"one"), Pair(2, "two"), Pair(3, "three"))
    println(count)

    val count2 = mapOf<Int, String>(Pair(1,"one"), Pair(2, "two"), Pair(3, "three"))
    println(count2)

}
