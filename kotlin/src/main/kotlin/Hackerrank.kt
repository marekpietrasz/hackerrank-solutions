//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
fun hackerRank01(ar: Array<Int>): Int =
        (ar.max() ?: 0).let { max ->
            ar.filter { it == max }.count()
        }

//https://www.hackerrank.com/challenges/staircase/problem
fun hackerRank02(n: Int) =
        (1..n).joinToString(separator = System.lineSeparator()) {
            " ".repeat(n - it) + "#".repeat(it)
        }