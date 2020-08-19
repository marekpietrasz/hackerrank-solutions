package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank18Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}, 3),
                Arguments.of(3, new int[]{1, 2, 3}, 0),
                Arguments.of(3, new int[]{1, 1, 1}, 1));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int[] arr, int result) {
        Assertions.assertEquals(result, new HackerRank18().sockMerchant(n, arr));
    }

}