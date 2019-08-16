package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank35Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(12, 2),
                Arguments.of(1012, 3));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int a, int result) {
        Assertions.assertEquals(result, new HackerRank35().findDigits(a));
    }

}