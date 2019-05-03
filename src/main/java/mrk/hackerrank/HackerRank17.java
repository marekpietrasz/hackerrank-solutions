package mrk.hackerrank;

import java.util.List;

//https://www.hackerrank.com/challenges/bon-appetit/problem
public class HackerRank17 {

    public void bonAppetit(List<Integer> bill, int k, int b) {
        System.out.println(bonAppetitInner(bill, k, b));
    }

    public String bonAppetitInner(List<Integer> bill, int k, int b) {
        int result = ((bill.stream().mapToInt(e -> e).sum() - bill.get(k)) / 2) - b;
        return result != 0 ? String.format("%d", -result) : "Bon Appetit";
    }

}
