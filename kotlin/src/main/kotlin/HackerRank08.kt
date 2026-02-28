private const val PASSING_GRADE: Int = 38

fun hackerRank08(grades: IntArray): IntArray {
    require(grades.size in 1..60) { "grades must have length 1..60, was ${grades.size}" }
    require(grades.all { it in 0..100 }) { "all grades must be in 0..100" }
    fun roundUpIfNeeded(score: Int): Int {
        val nextRoundOf5 = ((score / 5) + 1) * 5
        return if (nextRoundOf5 - score < 3) nextRoundOf5 else score
    }

    return grades.map { if (it < PASSING_GRADE) it else roundUpIfNeeded(it) }.toIntArray()
}