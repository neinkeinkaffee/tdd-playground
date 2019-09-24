import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MultiplyFractionsTest {

    @Test
    void multiplyingByZeroResultsInZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(1, 2).times(new Fraction(0)));
    }

    @Test
    void multiplyingByOneResultsInSameNumber() {
        Assertions.assertEquals(new Fraction(1, 2), new Fraction(1, 2).times(new Fraction(1)));
        Assertions.assertEquals(new Fraction(-1, 2), new Fraction(-1, 2).times(new Fraction(1)));
    }

    @Test
    void multiplyingByNegativeOneResultsInSameNumberButNegativeSign() {
        Assertions.assertEquals(new Fraction(-1, 2), new Fraction(1, 2).times(new Fraction(-1)));
        Assertions.assertEquals(new Fraction(1, 2), new Fraction(-1, 2).times(new Fraction(-1)));
    }

    @Test
    void multiplyingEqualFractions() {
        Assertions.assertEquals(new Fraction(1, 4), new Fraction(1, 2).times(new Fraction(1, 2)));
        Assertions.assertEquals(new Fraction(1, 4), new Fraction(-1, 2).times(new Fraction(-1, 2)));
        Assertions.assertEquals(new Fraction(9, 25), new Fraction(3, 5).times(new Fraction(3, 5)));
    }

    @Test
    void multiplyingNonEqualFractions() {
        Assertions.assertEquals(new Fraction(1, 6), new Fraction(1, 2).times(new Fraction(1, 3)));
        Assertions.assertEquals(new Fraction(5, 4), new Fraction(1, 2).times(new Fraction(5, 2)));
    }
}
