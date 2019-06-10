package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank33Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2, 92),
                Arguments.of(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3, 94),
                Arguments.of(new int[]{0, 0, 0}, 1, 97),
                Arguments.of(new int[]{0, 0, 0}, 2, 97));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int k, int result) {
        Assertions.assertEquals(result, new HackerRank33().jumpingOnClouds(input, k));

    }

}