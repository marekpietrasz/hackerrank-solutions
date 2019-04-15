package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HackerRank14Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(6,3, new int[]{1, 3, 2, 6, 1, 2}, 5),
                Arguments.of(6,5, new int[]{1, 2, 3, 4, 5, 6}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int k, int[] arr, int result) {
        Assertions.assertEquals(result, new HackerRank14().divisibleSumPairs(n, k, arr));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testStream(int n, int k, int[] arr, int result) {
        Assertions.assertEquals(result, new HackerRank14().divisibleSumPairsStream(n, k, arr));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testStream2(int n, int k, int[] arr, int result) {
        Assertions.assertEquals(result, new HackerRank14().divisibleSumPairsStream2(n, k, arr));
    }

}