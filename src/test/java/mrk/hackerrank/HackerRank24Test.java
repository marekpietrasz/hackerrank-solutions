package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class HackerRank24Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5), 5),
                Arguments.of(List.of(4, 6, 5, 3, 3, 1), 3),
                Arguments.of(List.of(1, 2, 2, 3, 1, 2), 5),
                Arguments.of(List.of(1, 2, 2, 1, 2), 5),
                Arguments.of(List.of(1, 1, 1, 1, 1), 5),
                Arguments.of(List.of(1, 1), 2),
                Arguments.of(List.of(1, 5), 1),
                Arguments.of(List.of(1, 1, 2, 3, 3, 3), 4),
                Arguments.of(List.of(1, 2, 3, 4, 5), 2));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(List<Integer> numbers, int result) {
        Assertions.assertEquals(result, new HackerRank24().pickingNumbers(numbers));
    }

}