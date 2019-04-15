package mrk.hackerrank;

import java.util.Arrays;

import java.util.Collections;
import java.util.function.Function;
import java.util.stream.IntStream;

public class HackerRank01 {

    public int birthdayCakeCandles(int[] ar) {
        int max = Arrays.stream(ar).max().orElse(0);
        return (int) Arrays.stream(ar).filter(e -> e == max).count();
    }
}
