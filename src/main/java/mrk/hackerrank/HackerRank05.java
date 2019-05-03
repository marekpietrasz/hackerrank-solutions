package mrk.hackerrank;

import java.util.Arrays;
import java.util.stream.LongStream;

//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class HackerRank05 {

    private LongStream createLongStream(int[]arr){
        return Arrays.stream(arr).mapToLong(i -> i);
    }

    private void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        System.out.printf("%d %d", createLongStream(arr).limit(4).sum(), createLongStream(arr).skip(1).sum());
    }

}
