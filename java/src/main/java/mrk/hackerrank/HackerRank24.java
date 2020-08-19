package mrk.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/picking-numbers/problem

public class HackerRank24 {

    public int pickingNumbers(List<Integer> numbers) {

        Map<Integer, Long> numberToCount = numbers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        IntUnaryOperator getSumOfElementAndNext = e -> (int) (numberToCount.getOrDefault(e, 0L) + numberToCount.getOrDefault(e + 1, 0L));

        return IntStream.rangeClosed(1, 100).map(getSumOfElementAndNext).max().orElse(0);
    }

}
