package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HackerRank17Test {
    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), 1, 2, "Bon Appetit"),
                Arguments.of(List.of(1, 2, 3), 1, 1, "-1"),
                Arguments.of(List.of(1, 2, 3), 1, 3, "1")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(List<Integer> bill, int exclude, int contribution, String result) {
        Assertions.assertEquals(result, new HackerRank17().bonAppetitInner(bill, exclude, contribution));
    }
}