package mrk.hackerrank;

import com.google.common.base.Preconditions;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem
public class HackerRank04 {

    public int[] compareTriplets(int[] a, int[] b) {
        Preconditions.checkArgument(a.length == 3, "a must have length 3, was %s", a.length);
        Preconditions.checkArgument(b.length == 3, "b must have length 3, was %s", b.length);
        int[] result = {0, 0};
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) result[0]++;
            else if (a[i] < b[i]) result[1]++;
        }
        return result;
    }
}
