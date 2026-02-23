package mrk.hackerrank;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.function.IntPredicate;

//https://www.hackerrank.com/challenges/plus-minus/problem
public class HackerRank03 {

    private double calculateNumber(int[] arr, IntPredicate predicate) {
        return Arrays.stream(arr).filter(predicate).count() / (double) arr.length;
    }

    private String formatLine(double number) {
        return String.format("%.6f", number);
    }

    public String plusMinus(int[] arr) {
        Preconditions.checkArgument(arr.length >= 1 && arr.length <= 100, "arr size must be in 1..100, was %s", arr.length);
        return String.join("\n",
                formatLine(calculateNumber(arr, e -> e > 0)),
                formatLine(calculateNumber(arr, e -> e < 0)),
                formatLine(calculateNumber(arr, e -> e == 0)));
    }
}
