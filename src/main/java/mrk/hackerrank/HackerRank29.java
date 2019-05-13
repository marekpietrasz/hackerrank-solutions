package mrk.hackerrank;

//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

import java.util.stream.IntStream;

public class HackerRank29 {

    public int beautifulDays(int i, int j, int k) {
        return (int) IntStream
                .rangeClosed(i, j)
                .filter(e -> Math.abs(e - revert(e))%k==0)
                .count();
    }

    private int revert(int number) {
        return Integer.valueOf(new StringBuilder(Integer.valueOf(number).toString())
                .reverse()
                .toString()
        );
    }
}
