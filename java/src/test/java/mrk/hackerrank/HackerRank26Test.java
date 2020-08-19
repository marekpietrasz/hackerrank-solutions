package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank26Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}, "abc", 9),
                Arguments.of(new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7}, "zaba", 28));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int[] h, String word, int result) {
        Assertions.assertEquals(result, new HackerRank26().designerPdfViewer(h, word));
    }


}