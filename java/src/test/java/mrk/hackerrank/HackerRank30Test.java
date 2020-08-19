package mrk.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HackerRank30Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(2,5),
                Arguments.of(3,9),
                Arguments.of(4,15),
                Arguments.of(5,24),
                Arguments.of(6,37),
                Arguments.of(7,56));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void test(int i, int result) {
        Assertions.assertEquals(result, new HackerRank30().viralAdvertising(i));
    }

}

//1      5     2       2
//2      6     3       5
//3      9     4       9
//4     12     6      15
//5     18     9      24
//6     27     13     37
//7     39     18     55
