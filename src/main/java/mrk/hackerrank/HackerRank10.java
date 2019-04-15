package mrk.hackerrank;

public class HackerRank10 {
    public String kangaroo(int x1, int v1, int x2, int v2) {

        if ((x1 < x2) && (v1 < v2))
            return "NO";

        if ((v1 != v2) && ((x2 - x1) % (v1 - v2)) == 0) {
            return "YES";
        }
        return "NO";

    }
}
