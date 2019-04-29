package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank21Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 1}, new int[]{5, 2, 8}, 10, 9),
                Arguments.of(new int[]{3, 1}, new int[]{5, 2, 8}, 10, 9),
                Arguments.of(new int[]{5}, new int[]{5}, 10, 10)

                );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] keyboards, int[] drives, int b, int result) {
        Assertions.assertEquals(result, new HackerRank21().getMoneySpent(keyboards, drives, b));
    }

}