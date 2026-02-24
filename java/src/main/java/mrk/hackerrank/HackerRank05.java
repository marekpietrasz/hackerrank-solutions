package mrk.hackerrank;

import java.util.Arrays;
import java.util.stream.LongStream;

//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class HackerRank05 {

    private LongStream createLongStream(int[]arr){
        return Arrays.stream(arr).mapToLong(i -> i);
    }

    public String miniMaxSum(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        return String.format("%d %d", createLongStream(sorted).limit(4).sum(), createLongStream(sorted).skip(1).sum());
    }

}
