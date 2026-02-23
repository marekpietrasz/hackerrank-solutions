import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank03Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank03Data")
    fun test_hackerRank03(
        name: String,
        input: Array<Int>,
        output: String,
    ) {
        assertEquals(output, hackerRank03(input))
    }

    companion object {
        @JvmStatic
        fun hackerRank03Data() =
            listOf(
                Arguments.of("mixed", arrayOf(1, 1, 0, -1, -1), "0.400000\n0.400000\n0.200000"),
                Arguments.of("mixed 2", arrayOf(-4, 3, -9, 0, -4, 1), "0.333333\n0.500000\n0.166667"),
                Arguments.of("all positive", arrayOf(1, 2, 3), "1.000000\n0.000000\n0.000000"),
                Arguments.of("all negative", arrayOf(-1, -2, -3), "0.000000\n1.000000\n0.000000"),
                Arguments.of("all zero", arrayOf(0, 0, 0), "0.000000\n0.000000\n1.000000"),
            )
    }
}
