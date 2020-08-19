package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank15Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1, new int[] {1, 2, 3, 3, 2}, 2),
                Arguments.of(4, new int[] {1, 6, 3, 5, 2}, 2),
                Arguments.of(7, new int[] {2, 5, 4, 5, 2}, 0));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int k, int[] height, int result) {
        Assertions.assertEquals(result, new HackerRank15().hurdleRace(k, height));
    }

}