package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank04Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{5, 6, 7}, new int[]{3, 6, 10}, new int[]{1, 1}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{3, 2, 1}, new int[]{1, 1}),
                Arguments.of(new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{0, 0}),
                Arguments.of(new int[]{3, 3, 3}, new int[]{1, 1, 1}, new int[]{3, 0}),
                Arguments.of(new int[]{1, 1, 1}, new int[]{3, 3, 3}, new int[]{0, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] a, int[] b, int[] expected) {
        Assertions.assertArrayEquals(expected, new HackerRank04().compareTriplets(a, b));
    }

    @ParameterizedTest
    @MethodSource("invalidInputs")
    void testInvalidInput(int[] a, int[] b) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HackerRank04().compareTriplets(a, b));
    }

    private static Stream<Arguments> invalidInputs() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2}),
                Arguments.of(new int[]{}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3})
        );
    }
}
