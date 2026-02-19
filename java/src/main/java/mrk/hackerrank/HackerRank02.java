package mrk.hackerrank;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/staircase/problem
public class HackerRank02 {

    public String staircase(int n) {
        Preconditions.checkArgument(n >= 1 && n <= 100, "n must be in 1..100, was %s", n);
        return IntStream.range(1, n + 1)
                .mapToObj(i -> " ".repeat(n - i) + "#".repeat(i))
                .collect(java.util.stream.Collectors.joining("\n"));
    }
}

