package mrk.hackerrank;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HackerRank19 {
    public int countingValleys(int n, String s) {
        int alt = 0;
        int countOfValleys = 0;
        for(char c : s.toCharArray()){
          switch (c){
              case 'U':
                  if(alt==-1){
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
