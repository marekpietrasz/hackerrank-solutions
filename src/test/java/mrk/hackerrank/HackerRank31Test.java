package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank31Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(5, 2, 1, 2),
                Arguments.of(5, 2, 2, 3),
                Arguments.of(5, 5, 2, 1),
                Arguments.of(5, 10, 2, 1),
                Arguments.of(5, 6, 2, 2),
                Arguments.of(5, 2, 4, 5),
                Arguments.of(7, 19, 2, 6),
                Arguments.of(5, 2, 5, 1));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int i, int j, int k, int result) {
        Assertions.assertEquals(result, new HackerRank31().saveThePrisoner(i, j, k));
    }

}