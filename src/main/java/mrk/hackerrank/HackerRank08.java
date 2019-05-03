package mrk.hackerrank;

import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/grading/problem
public class HackerRank08 {

    public int[] gradingStudents(int[] grades) {
        return IntStream.of(grades).map(e -> e < 38 ? e : roundUpIfNeeded(e)).toArray();
    }

    private int roundUpIfNeeded(int score) {
        int nextRoundOf5 = ((score / 5) + 1) * 5;
        return nextRoundOf5 - score < 3 ? nextRoundOf5 : score;
    }
}
