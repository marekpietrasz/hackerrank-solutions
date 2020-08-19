package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank10Test {

    private static Stream<Arguments> kangorooInputs() {
        return Stream.of(
                Arguments.of(1, 100, 100, 1, "YES"),
                Arguments.of(0, 2, 1, 2, "NO"),
                Arguments.of(0, 2, 5, 3, "NO"),
                Arguments.of(0, 1, 1, 1, "NO"),
                Arguments.of(0, 10000, 1, 1, "NO"),
                Arguments.of(4523, 8092, 9419, 8076, "YES")
        );
    }

    @ParameterizedTest
    @MethodSource("kangorooInputs")
    public void shouldCalculateKangoroJumpsSync(int x1, int v1, int x2, int v2, String expected) {
        Assertions.assertEquals(expected, new HackerRank10().kangaroo(x1, v1, x2, v2));
    }
}