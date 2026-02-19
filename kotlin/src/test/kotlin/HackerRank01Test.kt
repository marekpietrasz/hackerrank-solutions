import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank01Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank01Data")
    fun test_hackerRank01(
        name: String,
        input: Array<Int>,
        output: Int,
    ) {
        assertEquals(output, hackerRank01(input))
    }

    companion object {
        @JvmStatic
        fun hackerRank01Data() =
            listOf(
                Arguments.of("max appears once", arrayOf(1, 2, 3, 4), 1),
                Arguments.of("all elements equal", arrayOf(1, 1, 1, 1), 4),
                Arguments.of("max appears multiple times", arrayOf(3, 1, 3, 2), 2),
                Arguments.of("empty array", emptyArray<Int>(), 0),
            )
    }
}
