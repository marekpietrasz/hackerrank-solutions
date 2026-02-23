// https://www.hackerrank.com/challenges/compare-the-triplets/problem
fun hackerRank04(
    a: Array<Int>,
    b: Array<Int>,
): Array<Int> {
    require(a.size == 3) { "a must have length 3, was ${a.size}" }
    require(b.size == 3) { "b must have length 3, was ${b.size}" }
    return a
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
}
