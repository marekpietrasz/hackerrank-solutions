package mrk.hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HackerRank07 {
    public String timeConversion(String s) {
        LocalTime time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US));
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US));
    }

}
