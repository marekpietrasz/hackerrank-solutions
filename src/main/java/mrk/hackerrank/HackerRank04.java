package mrk.hackerrank;

import com.google.common.collect.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HackerRank04 {

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] result = IntStream.range(0, a.size()).mapToObj(e -> new Integer[]{a.get(e), b.get(e)}).reduce(new Integer[]{0, 0}, (r, e) -> {
            if (e[0] < e[1])
                return new Integer[]{r[0], r[1] + 1};
            if (e[0] > e[1])
                return new Integer[]{r[0]+1, r[1]};
            return r;
        });
        return Arrays.asList(result);
    }

}
