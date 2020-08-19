package mrk.hackerrank;

//https://www.hackerrank.com/challenges/save-the-prisoner/problem

public class HackerRank31 {

    public int saveThePrisoner(int n, int m, int s) {
        int position = (s + m - 1) % n;
        return position == 0 ? n : position;
    }

}
