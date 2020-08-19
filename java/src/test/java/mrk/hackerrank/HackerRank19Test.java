package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class HackerRank19Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(8, "DDUUUUDD", 1),
                Arguments.of(8, "UDDDUDUU", 1),
                Arguments.of(8, "UDUDUDUD", 0),
                Arguments.of(8, "DUDUDUDU", 4));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, String str, int result) {
        Assertions.assertEquals(result, new HackerRank19().countingValleys(n, str));
    }

}