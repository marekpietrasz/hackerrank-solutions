import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank02Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank02Data")
    fun test_hackerRank02(
        name: String,
        input: Int,
        output: String,
    ) {
        assertEquals(output, hackerRank02(input))
    }

    companion object {
        @JvmStatic
        fun hackerRank02Data() =
            listOf(
                Arguments.of("n=1", 1, "#"),
                Arguments.of("n=2", 2, " #\n##"),
                Arguments.of("n=3", 3, "  #\n ##\n###"),
                Arguments.of("n=4", 4, "   #\n  ##\n ###\n####"),
            )
    }
}
