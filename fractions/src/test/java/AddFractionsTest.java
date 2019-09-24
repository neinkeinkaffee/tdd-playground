import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddFractionsTest {
    @Test
    void shouldAddZeroAndZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        Assertions.assertEquals(0, sum.getNumerator());
    }

    @Test
    void shouldAddOneAndZero() {
        Fraction sum = new Fraction(1).plus(new Fraction(0));
        Assertions.assertEquals(1, sum.getNumerator());
    }

    @Test
    void shouldAddTwoPositiveWholeNumbers() {
        Fraction sum = new Fraction(1).plus(new Fraction(5));
        Assertions.assertEquals(6, sum.getNumerator());
    }

    @Test
    void shouldAddTwoWholeNumbers() {
        Fraction sum = new Fraction(1).plus(new Fraction(-5));
        Assertions.assertEquals(-4, sum.getNumerator());
    }

    @Test
    void shouldAddFractionsWithEqualDenominator() {
        Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        Assertions.assertEquals(3, sum.getNumerator());
        Assertions.assertEquals(5, sum.getDenominator());
    }
}
