package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HackerRank07Test {

    private static Stream<Arguments> timeConversionArguments() {
        return Stream.of(
                Arguments.of("07:05:45PM", "19:05:45"),
                Arguments.of("12:00:00AM", "00:00:00")
        );
    }

    @ParameterizedTest
    @MethodSource("timeConversionArguments")
    public void timeConversion(String input, String output) {
        Assertions.assertEquals(output, new HackerRank07().timeConversion(input));
    }
}