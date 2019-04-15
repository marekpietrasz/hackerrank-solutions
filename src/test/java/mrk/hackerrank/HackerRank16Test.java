package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HackerRank16Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 2, 2, 2, 3), 2),
                Arguments.of(List.of(2, 3, 3, 4), 3),
                Arguments.of(List.of(1, 2, 3, 4), 1),
                Arguments.of(List.of(1, 1, 2, 2, 3, 4), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(List<Integer> list, int result) {
        Assertions.assertEquals(result, new HackerRank16().migratoryBirds(list));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test2(List<Integer> list, int result) {
        Assertions.assertEquals(result, new HackerRank16().migratoryBirds2(list));
    }

}