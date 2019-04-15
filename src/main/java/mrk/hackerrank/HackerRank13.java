package mrk.hackerrank;

import java.util.Arrays;
import java.util.List;

public class HackerRank13 {
    public int birthday(List<Integer> list, int sum, int size) {
        int total = 0;

        for (int i = 0; i <= list.size() - size; i++) {
            if (list.subList(i, i + size).stream().mapToInt(Integer::intValue).sum() == sum)
                total++;
        }
        return total;
    }
}