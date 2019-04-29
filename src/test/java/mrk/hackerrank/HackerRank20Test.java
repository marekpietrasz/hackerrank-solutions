package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HackerRank20Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(6, 2, 1),
                Arguments.of(6, 1, 0),
                Arguments.of(5, 4, 0),
                Arguments.of(6, 6, 0),
                Arguments.of(6, 5, 1));
    }
    @ParameterizedTest
    @MethodSource("testData")
    void test(int n, int p, int result) {
        Assertions.assertEquals(result, new HackerRank20().pageCount(n, p));
    }

}