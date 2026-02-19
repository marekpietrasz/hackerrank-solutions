package mrk.hackerrank;

//https://www.hackerrank.com/challenges/permutation-equation/problem

public class HackerRank32 {

    public int[] permutationEquation(int[] p) {

        int[] result = new int[p.length];
        for (int e = 1; e <= p.length; e++) {
            result[p[p[e - 1] - 1] - 1] = e;
        }
        return result;
    }

}
