package mrk.hackerrank;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/migratory-birds/problem
public class HackerRank16 {
    public int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> numberToCount = arr
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return numberToCount
                .keySet()
                .stream()
                .min((o1, o2) -> {
                    int valueCompare = numberToCount.get(o2).compareTo(numberToCount.get(o1));
                    return valueCompare == 0 ? o1.compareTo(o2) : valueCompare;
                })
                .orElse(-1);
    }

    public int migratoryBirds2(List<Integer> arr) {
        Map<Integer, Long> numberToCount = arr
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return numberToCount
                .keySet()
                .stream()
                .min(Comparator.comparingLong((ToLongFunction<Integer>) numberToCount::get).reversed().thenComparingInt(o -> o))
                .orElse(-1);
    }

}
