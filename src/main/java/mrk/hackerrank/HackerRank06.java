package mrk.hackerrank;

import java.util.stream.IntStream;

public class HackerRank06 {
    public int diagonalDifference(int[][] arr) {
        int length = arr.length;
        int[] diff = IntStream.range(0, length)
                .mapToObj(i -> new int[]{arr[i][i], arr[i][length - i - 1]})
                .reduce(new int[] {0, 0}, (acc, curr) -> new int[] {acc[0] + curr[0], acc[1] + curr[1]});
        return Math.abs(diff[0] - diff[1]);

    }
}
