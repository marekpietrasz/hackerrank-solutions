package mrk.hackerrank;

//https://www.hackerrank.com/challenges/permutation-equation/problem

public class HackerRank33 {

    public int jumpingOnClouds(int[] c, int k) {
        int result = 100;
        int position = 0;
        do {
            position = (position + k) % c.length;
            result -= 1 + 2 * c[position];
        }
        while (position != 0);
        return result;
    }
}
