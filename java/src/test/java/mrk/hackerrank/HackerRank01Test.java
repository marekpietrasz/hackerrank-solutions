package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HackerRank01Test {

    private static Stream<Arguments> birthdayCakeCandlesArguments() {
        return Stream.of(
                Arguments.of("max appears once", new int[]{1, 2, 3, 4}, 1),
                Arguments.of("all elements equal", new int[]{1, 1, 1, 1}, 4),
                Arguments.of("max appears multiple times", new int[]{3, 1, 3, 2}, 2),
                Arguments.of("empty array", new int[]{}, 0)
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("birthdayCakeCandlesArguments")
    public void birthdayCakeCandles(String name, int[] input, int output) {
        Assertions.assertEquals(output, new HackerRank01().birthdayCakeCandles(input));
    }
}
