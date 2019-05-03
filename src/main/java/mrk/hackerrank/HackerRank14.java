package mrk.hackerrank;

import java.util.function.Function;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
public class HackerRank14 {
    public int divisibleSumPairs(int n, int k, int[] ar) {

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public int divisibleSumPairsStream(int n, int k, int[] ar) {
        return (int) IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(i + 1, n).mapToObj(j -> new int[]{i, j}))
                .flatMap(Function.identity())
                .filter(e -> (ar[e[0]] + ar[e[1]]) % k == 0)
                .count();
    }

    public int divisibleSumPairsStream2(int n, int k, int[] ar) {
        return IntStream.range(0, n)
                .map(i -> IntStream.range(i + 1, n)
                        .map(j -> (ar[i] + ar[j]) % k == 0 ? 1 : 0)
                        .sum())
                .sum();
    }

}

