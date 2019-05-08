package mrk.hackerrank;

//https://www.hackerrank.com/challenges/the-hurdle-race/problem

import java.util.Arrays;

public class HackerRank15 {

    public int hurdleRace(int k, int[] height) {
        return Math.max(Arrays.stream(height).max().orElse(0) - k, 0);
    }
}
