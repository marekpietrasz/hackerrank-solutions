package mrk.hackerrank;

import com.google.common.base.Preconditions;

//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class HackerRank05 {

    public String miniMaxSum(int[] arr) {
        Preconditions.checkArgument(arr.length == 5, "arr must have length 5, was %s", arr.length);
        long total = arr[0], min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            total += arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return String.format("%d %d", total - max, total - min);
    }
}
