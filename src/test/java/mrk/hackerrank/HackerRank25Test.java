package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HackerRank25Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120}, new int[]{6, 4, 2, 1}),
                Arguments.of(new int[]{100, 90, 90, 80, 75, 60}, new int[]{50, 65, 77, 90, 102}, new int[]{6, 5, 4, 2, 1}),
                Arguments.of(IntStream.rangeClosed(1, 10).map(e -> 10 + 1 - e).toArray(), IntStream.rangeClosed(1, 10).toArray(), IntStream.rangeClosed(1, 10).map(e -> 10 + 1 - e).toArray()),
                Arguments.of(IntStream.rangeClosed(1, 1000).flatMap(e -> IntStream.rangeClosed(1, 100)).sorted().map(e -> 100 + 1 - e).toArray(), IntStream.rangeClosed(1, 100).toArray(), IntStream.rangeClosed(1, 100).map(e -> 100 + 1 - e).toArray()));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] scores, int[] alice, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank25().climbingLeaderboard(scores, alice));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test2(int[] scores, int[] alice, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank25().climbingLeaderboard2(scores, alice));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test3(int[] scores, int[] alice, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank25().climbingLeaderboard3(scores, alice));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test4(int[] scores, int[] alice, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank25().climbingLeaderboard4(scores, alice));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test5(int[] scores, int[] alice, int[] result) {
        Assertions.assertArrayEquals(result, new HackerRank25().climbingLeaderboard5(scores, alice));
    }

}