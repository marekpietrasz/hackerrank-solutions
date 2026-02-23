import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HackerrankTests {
    @Test
    fun test_hackerRank04() {
        Assertions.assertEquals(arrayOf(1, 1).asList(), hackerRank04(arrayOf(5, 6, 7), arrayOf(3, 6, 10)).asList())
    }
}
