package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class HackerRank12Test {

    private static Stream<Arguments> records() {
        return Stream.of(
                Arguments.of(new int[]{10, 10}, new int[]{0, 0}),
                Arguments.of(new int[]{10, 12}, new int[]{1, 0}),
                Arguments.of(new int[]{10, 12, 5}, new int[]{1, 1}),
                Arguments.of(new int[]{10, 12, 5, 1}, new int[]{1, 2}),
                Arguments.of(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1}, new int[]{2, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("records")
    void shouldCalculateRecords(int[] input, int[] expected) {
        Assertions.assertArrayEquals(expected, new HackerRank12().breakingRecords(input));
    }

}