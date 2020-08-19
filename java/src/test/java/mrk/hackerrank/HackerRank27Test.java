package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank27Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 2),
                Arguments.of(2, 3),
                Arguments.of(3, 6),
                Arguments.of(4, 7),
                Arguments.of(5, 14),
                Arguments.of(6, 15),
                Arguments.of(7, 30),
                Arguments.of(8, 31),
                Arguments.of(9, 62),
                Arguments.of(10, 63));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int input, int result) {
        Assertions.assertEquals(result, new HackerRank27().utopianTree(input));
    }


}