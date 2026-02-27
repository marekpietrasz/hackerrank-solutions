package mrk.hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//https://www.hackerrank.com/challenges/time-conversion/problem
public class HackerRank07 {
    private static final DateTimeFormatter INPUT_FORMATTER = DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US);
    private static final DateTimeFormatter OUTPUT_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US);

    public String timeConversion(String s) {
        return LocalTime.parse(s, INPUT_FORMATTER).format(OUTPUT_FORMATTER);
    }
}
