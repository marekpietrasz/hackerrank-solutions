package mrk.hackerrank;

//https://www.hackerrank.com/challenges/angry-professor/problem

import java.util.Arrays;

public class HackerRank28 {

    public String angryProfessor(int k, int[] a) {
        return Arrays.stream(a).filter(e -> e <= 0).count() < k ? "YES" : "NO";
    }
}
