package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank05Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, "10 14"),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, "10 14"),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, "4 4"),
                Arguments.of(new int[]{7, 69, 2, 221, 8974}, "299 9271")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] arr, String expected) {
        Assertions.assertEquals(expected, new HackerRank05().miniMaxSum(arr));
    }
}
