package mrk.hackerrank;

//https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRank34 {

    public int[] circularArrayRotation(int[] a, int k, int[] queries) {
        List<Integer> rotated = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.rotate(rotated, k);
        return Arrays.stream(queries).map(rotated::get).toArray();


    }

    public int[] circularArrayRotation2(int[] a, int k, int[] queries) {
        int n = a.length;
        return Arrays.stream(queries).map(e -> a[(e - k % n < 0) ? e - k % n + n : e - k % n]).toArray();
    }

}
