import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank06Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank06Data")
    fun test_hackerRank06(
        name: String,
        input: Array<IntArray>,
        output: Int,
    ) {
        assertEquals(output, hackerRank06(input))
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("invalidInputs")
    fun test_hackerRank06_invalidInput(
        name: String,
        input: Array<IntArray>,
    ) {
        assertThrows(IllegalArgumentException::class.java) { hackerRank06(input) }
    }

    companion object {
        @JvmStatic
        fun hackerRank06Data() =
            listOf(
                Arguments.of("3x3 matrix", arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(9, 8, 9)), 2),
                Arguments.of("1x1 matrix", arrayOf(intArrayOf(1)), 0),
                Arguments.of("boundary max", arrayOf(intArrayOf(100, 0), intArrayOf(0, 100)), 200),
                Arguments.of("boundary min", arrayOf(intArrayOf(-100, 0), intArrayOf(0, -100)), 200),
            )

        @JvmStatic
        fun invalidInputs() =
            listOf(
                Arguments.of("element above 100", arrayOf(intArrayOf(101, 0), intArrayOf(0, 0))),
                Arguments.of("element below -100", arrayOf(intArrayOf(0, 0), intArrayOf(0, -101))),
                Arguments.of("element far out of range", arrayOf(intArrayOf(0, 200), intArrayOf(0, 0))),
            )
    }
}
