import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Locale

private val INPUT_FORMATTER: DateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US)
private val OUTPUT_FORMATTER: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US)

// https://www.hackerrank.com/challenges/time-conversion/problem
fun hackerRank07(s: String): String = LocalTime.parse(s, INPUT_FORMATTER).format(OUTPUT_FORMATTER)
