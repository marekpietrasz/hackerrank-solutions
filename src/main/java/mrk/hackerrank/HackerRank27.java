package mrk.hackerrank;

//https://www.hackerrank.com/challenges/utopian-tree/problem

public class HackerRank27 {

    public int utopianTree(int n) {
        return (int) Math.pow(2, (n + 1) / 2 + 1) - n % 2 - 1;
    }
}
