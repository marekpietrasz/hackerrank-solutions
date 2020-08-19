package mrk.hackerrank;

//https://www.hackerrank.com/challenges/counting-valleys/problem
public class HackerRank19 {
    public int countingValleys(int n, String s) {
        int alt = 0;
        int countOfValleys = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'U':
                    if (alt == -1) {
                        countOfValleys++;
                    }
                    alt++;
                    break;
                case 'D':
                    alt--;
            }
        }
        return countOfValleys;
    }
}
