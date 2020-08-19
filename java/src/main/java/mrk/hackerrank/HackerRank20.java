package mrk.hackerrank;

//https://www.hackerrank.com/challenges/drawing-book/problem
public class HackerRank20 {
    public int pageCount(int n, int p) {
        return Math.min(p/2, (n/2)-(p/2));
    }
}
