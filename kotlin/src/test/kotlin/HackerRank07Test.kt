import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class HackerRank07Test {
    @ParameterizedTest(name = "{0}")
    @MethodSource("hackerRank07Data")
    fun test_hackerRank07(
        name: String,
        input: String,
        output: String,
    ) {
        assertEquals(output, hackerRank07(input))
    }

    companion object {
        @JvmStatic
        fun hackerRank07Data() =
            listOf(
                Arguments.of("PM time", "07:05:45PM", "19:05:45"),
                Arguments.of("midnight", "12:00:00AM", "00:00:00"),
                Arguments.of("noon", "12:00:00PM", "12:00:00"),
                Arguments.of("just after midnight", "12:01:00AM", "00:01:00"),
                Arguments.of("regular AM", "01:00:00AM", "01:00:00"),
                Arguments.of("just before midnight", "11:59:59PM", "23:59:59"),
            )
    }
}
