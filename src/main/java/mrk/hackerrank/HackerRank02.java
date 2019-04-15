package mrk.hackerrank;

import java.util.Collections;
import java.util.stream.IntStream;

public class HackerRank02 {

    public void staircase(int n) {
        IntStream.range(1, n + 1).forEach((i) -> {
            System.out.print(String.join("", Collections.nCopies(n - i, " ")));
            System.out.println(String.join("", Collections.nCopies(i, "#")));
        });
    }
}

