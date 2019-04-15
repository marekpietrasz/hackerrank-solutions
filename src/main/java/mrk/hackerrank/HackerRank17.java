package mrk.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class HackerRank17 {

    public void bonAppetit(List<Integer> bill, int k, int b) {
        System.out.println(bonAppetitInner(bill, k, b));
    }

    public String bonAppetitInner(List<Integer> bill, int k, int b) {
        int result = ((bill.stream().mapToInt(e -> e).sum() - bill.get(k)) / 2) - b;
        return result != 0 ? String.format("%d", -result) : "Bon Appetit";
    }

}
