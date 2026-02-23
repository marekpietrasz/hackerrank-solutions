import java.text.DecimalFormat

// https://www.hackerrank.com/challenges/plus-minus/problem
fun hackerRank03(arr: Array<Int>): String {
    val format = DecimalFormat("0.000000")

    fun calculateRatio(predicate: (Int) -> Boolean) = arr.count(predicate) / arr.size.toDouble()

    return listOf(
        calculateRatio { it > 0 },
        calculateRatio { it < 0 },
        calculateRatio { it == 0 },
    ).joinToString(separator = "\n") { format.format(it) }
}
