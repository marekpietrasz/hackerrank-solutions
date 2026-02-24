import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank05Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank05Data")
    fun test_hackerRank05(
        name: String,
        input: Array<Int>,
        output: String,
    ) {
        assertEquals(output, hackerRank05(input))
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("invalidInputs")
    fun test_hackerRank05_invalidInput(
        name: String,
        input: Array<Int>,
    ) {
        assertThrows(IllegalArgumentException::class.java) { hackerRank05(input) }
    }

    companion object {
        @JvmStatic
        fun hackerRank05Data() =
            listOf(
                Arguments.of("ascending", arrayOf(1, 2, 3, 4, 5), "10 14"),
                Arguments.of("descending", arrayOf(5, 4, 3, 2, 1), "10 14"),
                Arguments.of("all equal", arrayOf(1, 1, 1, 1, 1), "4 4"),
                Arguments.of("large values", arrayOf(7, 69, 2, 221, 8974), "299 9271"),
            )

        @JvmStatic
        fun invalidInputs() =
            listOf(
                Arguments.of("too short", arrayOf(1, 2, 3, 4)),
                Arguments.of("too long", arrayOf(1, 2, 3, 4, 5, 6)),
                Arguments.of("empty", emptyArray<Int>()),
            )
    }
}
