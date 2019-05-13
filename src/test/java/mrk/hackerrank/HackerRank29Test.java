package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank29Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(20, 23, 6, 2));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int i, int j, int k, int result) {
        Assertions.assertEquals(result, new HackerRank29().beautifulDays(i, j, k));
    }

}