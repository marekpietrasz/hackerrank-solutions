package mrk.hackerrank;

//https://www.hackerrank.com/challenges/find-digits/problem

public class HackerRank35 {

    public int findDigits(int n) {
        return (int) Integer
                .toString(n)
                .chars()
                .map(e -> e - '0')
                .filter(e -> (e != 0) && (n % e == 0))
                .count();
    }

}
