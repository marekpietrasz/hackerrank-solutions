package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank22Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(2, 5, 4, "Cat B"),
                Arguments.of(1, 10, 2, "Cat A"),
                Arguments.of(1, 3, 2, "Mouse C"),
                Arguments.of(1, 1, 1, "Mouse C"),
                Arguments.of(1, 1, 10, "Mouse C")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int x, int y, int z, String result) {
        Assertions.assertEquals(result, new HackerRank22().catAndMouse(x, y, z));
    }

}