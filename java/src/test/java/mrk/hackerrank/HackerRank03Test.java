package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank03Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0, -1, -1}, "0.4000\n0.4000\n0.2000"),
                Arguments.of(new int[]{-4, 3, -9, 0, -4, 1}, "0.3333\n0.5000\n0.1667"),
                Arguments.of(new int[]{1, 2, 3}, "1.0000\n0.0000\n0.0000"),
                Arguments.of(new int[]{-1, -2, -3}, "0.0000\n1.0000\n0.0000"),
                Arguments.of(new int[]{0, 0, 0}, "0.0000\n0.0000\n1.0000")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] arr, String expected) {
        Assertions.assertEquals(expected, new HackerRank03().plusMinus(arr));
    }

    @ParameterizedTest
    @MethodSource("invalidInputs")
    void testInvalidInput(int[] arr) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HackerRank03().plusMinus(arr));
    }

    private static Stream<Arguments> invalidInputs() {
        return Stream.of(
                Arguments.of(new int[]{}),
                Arguments.of(new int[101])
        );
    }
}
