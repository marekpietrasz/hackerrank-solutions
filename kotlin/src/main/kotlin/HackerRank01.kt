// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
// Birthday Cake Candles
fun hackerRank01(arr: Array<Int>): Int {
    val max = arr.maxOrNull() ?: return 0
    return arr.count { it == max }
}
