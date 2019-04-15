package mrk.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HackerRank11 {

    public int getTotalX(int[] a, int[] b) {
        return (int) IntStream.rangeClosed(a[a.length - 1], b[0]).filter(e -> isFactor(e, b) && areFactors(e, a)).count();
    }

    private boolean areFactors(int number, int[] arr) {
        return Arrays.stream(arr).allMatch(e -> number % e == 0);
    }

    private boolean isFactor(int number, int[] arr) {
        return Arrays.stream(arr).allMatch(e -> e % number == 0);
    }

}
