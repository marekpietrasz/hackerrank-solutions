package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank34Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2}, new int[]{2, 3, 1}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] a, int k, int[] queries, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank34().circularArrayRotation(a, k, queries));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test2(int[] a, int k, int[] queries, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank34().circularArrayRotation2(a, k, queries));
    }
}