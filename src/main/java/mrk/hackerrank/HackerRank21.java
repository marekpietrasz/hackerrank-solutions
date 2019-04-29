package mrk.hackerrank;

public class HackerRank21 {
    public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = -1;
        for(int k : keyboards)
            for (int d: drives){
                int currentSum = k + d;
                if( currentSum > result && currentSum <= b){
                    result = currentSum;
                }
            }
        return result;
    }
}
