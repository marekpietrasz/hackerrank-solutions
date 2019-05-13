package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank28Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(3, new int[]{-1,-3,4,2}, "YES"),
                Arguments.of(2, new int[]{0,-1,2,1}, "NO"));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int threshold, int[]times, String result) {
        Assertions.assertEquals(result, new HackerRank28().angryProfessor(threshold,times));
    }


}