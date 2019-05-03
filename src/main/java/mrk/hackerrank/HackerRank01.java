package mrk.hackerrank;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class HackerRank01 {

    public int birthdayCakeCandles(int[] ar) {
        int max = Arrays.stream(ar).max().orElse(0);
        return (int) Arrays.stream(ar).filter(e -> e == max).count();
    }
}
