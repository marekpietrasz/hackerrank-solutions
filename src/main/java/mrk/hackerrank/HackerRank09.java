package mrk.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HackerRank09 {
    public void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        printSizeOfMappedAndFilteredStream(Arrays.stream(apples), a, s, t);
        printSizeOfMappedAndFilteredStream(Arrays.stream(oranges), b, s, t);
    }

    private void printSizeOfMappedAndFilteredStream(IntStream stream, int position, int s, int t) {
        System.out.println(stream.map(e -> e + position).filter(e -> e >= s && e <= t).count());
    }

}
