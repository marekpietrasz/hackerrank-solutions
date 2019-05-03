package mrk.hackerrank;

import java.util.Arrays;
import java.util.function.IntPredicate;

//https://www.hackerrank.com/challenges/plus-minus/problem
public class HackerRank03 {

    private void printLine(double number) {
        System.out.println(String.format("%.4f", number));
    }

    private double calculateNumber(int[] arr, IntPredicate predicate) {
        return Arrays.stream(arr).filter(predicate).count() / (double) arr.length;
    }

    public void plusMinus(int[] arr) {
        printLine(calculateNumber(arr, e -> e > 0));
        printLine(calculateNumber(arr, e -> e < 0));
        printLine(calculateNumber(arr, e -> e == 0));
    }
}
