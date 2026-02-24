// https://www.hackerrank.com/challenges/mini-max-sum/problem
fun hackerRank05(arr: Array<Int>): String {
    require(arr.size == 5) { "arr must have length 5, was ${arr.size}" }
    val total = arr.sumOf { it.toLong() }
    val min = arr.minOf { it.toLong() }
    val max = arr.maxOf { it.toLong() }
    return String.format("%d %d", total - max, total - min)
}
