package mrk.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

public class HackerRank25 {

    public int[] climbingLeaderboard(int[] scores, int[] alice) {
        return Arrays.stream(alice).map(e -> getPosition(scores, e)).toArray();
    }

    private int getPosition(int[] scores, int score) {
        if (score >= scores[0]) {
            return 1;
        }

        int position = 1;
        int lastScore = scores[0];
        for (int s : scores) {
            if (score >= s) {
                return position + 1;
            }
            if (lastScore > s) {
                position++;
                lastScore = s;
            }
        }
        return position + 1;
    }


    public int[] climbingLeaderboard2(int[] scores, int[] alice) {
        List<Integer> positions = calculatePositions(scores);
        return Arrays.stream(alice).map(e -> findPosition(positions, e)).toArray();
    }

    private int findPosition(List<Integer> positions, int score) {
        for (int i = 0; i < positions.size(); i++) {
            if (positions.get(i) <= score) {
                return i + 1;
            }
        }
        return positions.size() + 1;
    }

    private List<Integer> calculatePositions(int[] scores) {
        List<Integer> cache = new ArrayList<>(List.of(scores[0]));
        int lastScore = scores[0];
        for (int s : scores) {
            if (lastScore > s) {
                cache.add(s);
                lastScore = s;
            }
        }
        return cache;
    }

    public int[] climbingLeaderboard3(int[] scores, int[] alice) {
        List<Integer> positions = calculatePositions(scores);
        int[] result = new int[alice.length];
        int lastPosition = positions.size() - 1;
        for (int i = alice.length - 1; i >= 0; i--) {
            result[i] = findPositionReversed(positions, alice[i], lastPosition);
        }
        return result;
    }

    private int findPositionReversed(List<Integer> positions, int score, int startIndex) {
        for (int i = startIndex; i >= 0; i--) {
            Integer scoreAtPosition = positions.get(i);
            if (score < scoreAtPosition) {
                return i + 2;
            }
            if (score == scoreAtPosition) {
                return i + 1;
            }
        }
        return 1;
    }

    public int[] climbingLeaderboard4(int[] scores, int[] alice) {
        int n = scores.length;
        int[] result = new int[alice.length];
        int[] array = IntStream.range(0, n).map(i -> scores[n - i - 1]).distinct().toArray();
        int index = 0;
        for (int i = 0; i < alice.length; i++) {
            index = Arrays.binarySearch(array, index < 0 ? 0 : index, array.length, alice[i]);
            if (index < 0) index = -index - 2;
            result[i] = array.length - index;
        }
        return result;
    }

    public int[] climbingLeaderboard5(int[] scores, int[] alice) {
        int[] distinctScores = IntStream.of(scores).distinct().toArray();
        int[] result = new int[alice.length];
        int currentPosition = distinctScores.length - 1;
        for (int i = 0; i < alice.length; i++) {
            while (currentPosition >= 0) {
                if (alice[i] >= distinctScores[currentPosition]) {
                    currentPosition--;
                } else {
                    result[i] = currentPosition + 2;
                    break;
                }
            }
            if (currentPosition < 0){
                result[i] = 1;
            }
        }
        return result;
    }

}
