package mrk.hackerrank;

import com.google.common.base.Preconditions;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/diagonal-difference/problem
public class HackerRank06 {
    public int diagonalDifference(int[][] arr) {
        Preconditions.checkArgument(
                Arrays.stream(arr).flatMapToInt(Arrays::stream).allMatch(e -> e >= -100 && e <= 100),
                "all elements must be in -100..100");
        int length = arr.length;
        int primary = 0, secondary = 0;
        for (int i = 0; i < length; i++) {
            primary += arr[i][i];
            secondary += arr[i][length - i - 1];
        }
        return Math.abs(primary - secondary);
    }
}
