package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HackerRank13Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of(1, 1), 1, 1, 2),
                Arguments.of(List.of(1, 1, 1, 1), 2, 2, 3),
                Arguments.of(List.of(1, 1, 1, 1), 3, 3, 2),
                Arguments.of(List.of(1, 1, 1, 1), 4, 4, 1),
                Arguments.of(List.of(6, 6, 1, 1), 2, 2, 1),
                Arguments.of(List.of(1, 5, 5, 1), 2, 2, 0),
                Arguments.of(List.of(1, 1), 2, 1, 0),
                Arguments.of(List.of(1, 1, 1), 4, 3, 0),
                Arguments.of(List.of(1, 2, 1, 3, 2), 3, 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(List<Integer> numbers, int sum, int size, int result) {
        Assertions.assertEquals(result, new HackerRank13().birthday(numbers, sum, size));
    }

}