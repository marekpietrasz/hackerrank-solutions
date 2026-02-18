package mrk.hackerrank;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class HackerRank01 {

    public int birthdayCakeCandles(int[] ar) {
        int max = 0, count = 0;
        for (int candle : ar) {
            if (candle > max) { max = candle; count = 1; }
            else if (candle == max) count++;
        }
        return count;
    }
}
