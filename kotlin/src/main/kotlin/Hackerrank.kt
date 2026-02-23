import java.text.DecimalFormat

// https://www.hackerrank.com/challenges/staircase/problem
fun hackerRank02(n: Int) =
    (1..n).joinToString(separator = System.lineSeparator()) {
        " ".repeat(n - it) + "#".repeat(it)
    }

// https://www.hackerrank.com/challenges/plus-minus/problem
fun hackerRank03(arr: Array<Int>) {
    val format = DecimalFormat("0.000000")

    fun printNumberAsLine(number: Double) = with(format.format(number)) { println(this) }

    fun calculateRatio(predicate: (Int) -> Boolean) = arr.filter(predicate).count() / arr.size.toDouble()

    fun calculateRatios() =
        listOf(
            calculateRatio { it > 0 },
            calculateRatio { it < 0 },
            calculateRatio { it == 0 },
        )

    calculateRatios().forEach { printNumberAsLine(it) }
}

// https://www.hackerrank.com/challenges/compare-the-triplets/problem
fun hackerRank04(
    a: Array<Int>,
    b: Array<Int>,
): Array<Int> =
    a
        .zip(b)
        .fold(Pair(0, 0)) { acc, e ->
            e.first.compareTo(e.second).let { diff ->
                when {
                    diff > 0 -> acc.copy(first = acc.first + 1)
                    diff < 0 -> acc.copy(second = acc.second + 1)
                    else -> acc
                }
            }
        }.let { arrayOf(it.first, it.second) }
