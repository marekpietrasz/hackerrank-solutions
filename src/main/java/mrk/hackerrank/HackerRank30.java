package mrk.hackerrank;

//https://www.hackerrank.com/challenges/strange-advertising/problem

public class HackerRank30 {

    public int viralAdvertising(int n) {
        int result = 2;
        int liked = 2;
        for (int i = 2; i <= n; i++) {
            int shared = liked * 3;
            liked = shared / 2;
            result+= liked;
        }
        return result;
    }

}
