package mrk.hackerrank;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/sock-merchant/problem
public class HackerRank18 {
    public int sockMerchant(int n, int[] ar) {
        return Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .map(e -> e/2)
                .mapToInt(Long::intValue)
                .sum();
    }
}
