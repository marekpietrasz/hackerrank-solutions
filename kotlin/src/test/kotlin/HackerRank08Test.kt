import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank08Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank08Data")
    fun test_hackerRank08(
        name: String,
        input: IntArray,
        expected: IntArray,
    ) {
        assertArrayEquals(expected, hackerRank08(input))
    }

    @Test
    fun emptyArrayThrows() {
        assertThrows(IllegalArgumentException::class.java) { hackerRank08(intArrayOf()) }
    }

    @Test
    fun tooLargeArrayThrows() {
        assertThrows(IllegalArgumentException::class.java) { hackerRank08(IntArray(61)) }
    }

    @Test
    fun gradeAbove100Throws() {
        assertThrows(IllegalArgumentException::class.java) { hackerRank08(intArrayOf(101)) }
    }

    @Test
    fun gradeBelow0Throws() {
        assertThrows(IllegalArgumentException::class.java) { hackerRank08(intArrayOf(-1)) }
    }

    companion object {
        @JvmStatic
        fun hackerRank08Data() =
            listOf(
                Arguments.of("example", intArrayOf(73, 67, 38, 33), intArrayOf(75, 67, 40, 33)),
                Arguments.of("no rounding below threshold", intArrayOf(37), intArrayOf(37)),
                Arguments.of("no rounding well below threshold", intArrayOf(34), intArrayOf(34)),
                Arguments.of("rounds up at threshold", intArrayOf(38), intArrayOf(40)),
                Arguments.of("already multiple of 5", intArrayOf(40), intArrayOf(40)),
                Arguments.of("rounds up diff 1", intArrayOf(84), intArrayOf(85)),
                Arguments.of("rounds up diff 2", intArrayOf(83), intArrayOf(85)),
                Arguments.of("no rounding diff 3", intArrayOf(82), intArrayOf(82)),
                Arguments.of("max grade", intArrayOf(100), intArrayOf(100)),
            )
    }
}
