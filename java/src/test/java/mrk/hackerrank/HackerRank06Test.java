package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank06Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {9, 8, 9}}, 2),
                Arguments.of(new int[][]{{1}}, 0),
                Arguments.of(new int[][]{{100, 0}, {0, 100}}, 200),
                Arguments.of(new int[][]{{-100, 0}, {0, -100}}, 200)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[][] arr, int expected) {
        Assertions.assertEquals(expected, new HackerRank06().diagonalDifference(arr));
    }

    @ParameterizedTest
    @MethodSource("invalidInputs")
    void testInvalidInput(int[][] arr) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HackerRank06().diagonalDifference(arr));
    }

    private static Stream<Arguments> invalidInputs() {
        return Stream.of(
                Arguments.of((Object) new int[][]{{101, 0}, {0, 0}}),
                Arguments.of((Object) new int[][]{{0, 0}, {0, -101}}),
                Arguments.of((Object) new int[][]{{0, 200}, {0, 0}})
        );
    }
}
