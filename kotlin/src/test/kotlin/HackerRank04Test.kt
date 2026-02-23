import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank04Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank04Data")
    fun test_hackerRank04(
        name: String,
        a: Array<Int>,
        b: Array<Int>,
        output: Array<Int>,
    ) {
        assertArrayEquals(output, hackerRank04(a, b))
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("invalidInputs")
    fun test_hackerRank04_invalidInput(
        name: String,
        a: Array<Int>,
        b: Array<Int>,
    ) {
        assertThrows(IllegalArgumentException::class.java) { hackerRank04(a, b) }
    }

    companion object {
        @JvmStatic
        fun hackerRank04Data() =
            listOf(
                Arguments.of("a wins 1, b wins 1", arrayOf(5, 6, 7), arrayOf(3, 6, 10), arrayOf(1, 1)),
                Arguments.of("a wins 1, b wins 1 reversed", arrayOf(1, 2, 3), arrayOf(3, 2, 1), arrayOf(1, 1)),
                Arguments.of("draw", arrayOf(1, 1, 1), arrayOf(1, 1, 1), arrayOf(0, 0)),
                Arguments.of("a wins all", arrayOf(3, 3, 3), arrayOf(1, 1, 1), arrayOf(3, 0)),
                Arguments.of("b wins all", arrayOf(1, 1, 1), arrayOf(3, 3, 3), arrayOf(0, 3)),
            )

        @JvmStatic
        fun invalidInputs() =
            listOf(
                Arguments.of("a too short", arrayOf(1, 2), arrayOf(1, 2, 3)),
                Arguments.of("b too short", arrayOf(1, 2, 3), arrayOf(1, 2)),
                Arguments.of("a empty", emptyArray<Int>(), arrayOf(1, 2, 3)),
                Arguments.of("a too long", arrayOf(1, 2, 3, 4), arrayOf(1, 2, 3)),
            )
    }
}
