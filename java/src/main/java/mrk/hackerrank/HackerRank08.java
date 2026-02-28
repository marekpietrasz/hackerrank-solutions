package mrk.hackerrank;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/grading/problem
public class HackerRank08 {

    private static final int PASSING_GRADE = 38;

    public int[] gradingStudents(int[] grades) {
        Preconditions.checkArgument(grades.length >= 1 && grades.length <= 60,
                "grades must have length 1..60, was %s", grades.length);
        Preconditions.checkArgument(Arrays.stream(grades).allMatch(e -> e >= 0 && e <= 100),
                "all grades must be in 0..100");
        return IntStream.of(grades).map(e -> e < PASSING_GRADE ? e : roundUpIfNeeded(e)).toArray();
    }

    private int roundUpIfNeeded(int score) {
        int nextRoundOf5 = ((score / 5) + 1) * 5;
        return nextRoundOf5 - score < 3 ? nextRoundOf5 : score;
    }
}
