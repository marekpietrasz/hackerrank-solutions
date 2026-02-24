// https://www.hackerrank.com/challenges/mini-max-sum/problem
fun hackerRank05(arr: Array<Int>): String {
    require(arr.size == 5) { "arr must have length 5, was ${arr.size}" }
    var total = arr[0].toLong()
    var min = arr[0].toLong()
    var max = arr[0].toLong()
    for (i in 1 until arr.size) {
        total += arr[i]
        if (arr[i] < min) min = arr[i].toLong()
        if (arr[i] > max) max = arr[i].toLong()
    }
    return String.format("%d %d", total - max, total - min)
}
