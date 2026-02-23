package mrk.hackerrank;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/diagonal-difference/problem
public class HackerRank06 {
    public int diagonalDifference(int[][] arr) {
        Preconditions.checkArgument(
                Arrays.stream(arr).flatMapToInt(Arrays::stream).allMatch(e -> e >= -100 && e <= 100),
                "all elements must be in -100..100");
        int length = arr.length;
        int[] diff = IntStream.range(0, length)
                .mapToObj(i -> new int[]{arr[i][i], arr[i][length - i - 1]})
                .reduce(new int[] {0, 0}, (acc, curr) -> new int[] {acc[0] + curr[0], acc[1] + curr[1]});
        return Math.abs(diff[0] - diff[1]);

    }
}
