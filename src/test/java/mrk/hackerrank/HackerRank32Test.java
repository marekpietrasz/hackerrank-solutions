package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank32Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1}, new int[]{2, 3, 1}),
                Arguments.of(new int[]{5, 2, 1, 3, 4}, new int[]{4, 2, 5, 1, 3}),
                Arguments.of(new int[]{4, 3, 5, 1, 2}, new int[]{1, 3, 5, 4, 2}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] input, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank32().permutationEquation(input));

    }

}