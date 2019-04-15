package mrk.hackerrank;

import java.util.Arrays;

public class HackerRank12 {

    public int[] breakingRecords(int[] scores) {

        int min = 0, max = 0, currMin = scores[0], currMax = scores[0];

        for (int score : scores) {
            if (score > currMax) {
                max++;
                currMax = score;
            }
            if (score < currMin) {
                min++;
                currMin = score;
            }
        }
        return new int[]{max, min};
    }


}
