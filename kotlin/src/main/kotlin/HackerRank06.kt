import kotlin.math.abs

fun hackerRank06(arr: Array<IntArray>): Int {
    require(arr.all { it.all { e -> e >= -100 && e <= 100 } }) { "All elements of the array must be in -100..100" }
    val length: Int = arr.size
    var primary: Int = 0
    var secondary: Int = 0
    for (i in arr.indices) {
        primary += arr[i][i]
        secondary += arr[i][length - 1 - i]
    }
    return abs(primary - secondary)
}
