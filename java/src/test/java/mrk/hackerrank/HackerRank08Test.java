package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank08Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{73, 67, 38, 33}, new int[]{75, 67, 40, 33}),
                Arguments.of(new int[]{37}, new int[]{37}),
                Arguments.of(new int[]{34}, new int[]{34}),
                Arguments.of(new int[]{38}, new int[]{40}),
                Arguments.of(new int[]{40}, new int[]{40}),
                Arguments.of(new int[]{84}, new int[]{85}),
                Arguments.of(new int[]{83}, new int[]{85}),
                Arguments.of(new int[]{82}, new int[]{82}),
                Arguments.of(new int[]{100}, new int[]{100})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] grades, int[] expected) {
        Assertions.assertArrayEquals(expected, new HackerRank08().gradingStudents(grades));
    }

    @org.junit.jupiter.api.Test
    void emptyArrayThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new HackerRank08().gradingStudents(new int[]{}));
    }

    @org.junit.jupiter.api.Test
    void tooLargeArrayThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new HackerRank08().gradingStudents(new int[61]));
    }

    @org.junit.jupiter.api.Test
    void gradeAbove100Throws() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new HackerRank08().gradingStudents(new int[]{101}));
    }

    @org.junit.jupiter.api.Test
    void gradeBelow0Throws() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new HackerRank08().gradingStudents(new int[]{-1}));
    }
}
