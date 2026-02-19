package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank02Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1, "#"),
                Arguments.of(2, " #\n##"),
                Arguments.of(3, "  #\n ##\n###"),
                Arguments.of(4, "   #\n  ##\n ###\n####")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, String expected) {
        Assertions.assertEquals(expected, new HackerRank02().staircase(n));
    }

    @ParameterizedTest
    @MethodSource("invalidInputs")
    void testInvalidInput(int n) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HackerRank02().staircase(n));
    }

    private static Stream<Arguments> invalidInputs() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(-1),
                Arguments.of(101)
        );
    }
}
