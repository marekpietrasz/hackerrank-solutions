package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank23Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{new int[]{5, 3, 4}, new int[]{1, 5, 8}, new int[]{6, 4, 2}}, 7),
                Arguments.of(new int[][]{new int[]{4, 8, 2}, new int[]{4, 5, 7}, new int[]{6, 1, 6}}, 4),
                Arguments.of(new int[][]{new int[]{4, 9, 2}, new int[]{3, 5, 7}, new int[]{8, 1, 5}}, 1),
                Arguments.of(new int[][]{new int[]{4, 5, 8}, new int[]{2, 4, 1}, new int[]{1, 9, 7}}, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[][] square, int result) {
        Assertions.assertEquals(result, new HackerRank23().formingMagicSquare(square));
    }

}