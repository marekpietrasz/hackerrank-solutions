// https://www.hackerrank.com/challenges/staircase/problem
fun hackerRank02(n: Int): String =
    (1..n).joinToString(separator = "\n") {
        " ".repeat(n - it) + "#".repeat(it)
    }
