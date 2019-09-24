import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddFractionsTest {
    @Test
    void shouldAddZeroAndZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    void shouldAddOneAndZero() {
        Assertions.assertEquals(new Fraction(1), new Fraction(1).plus(new Fraction(0)));
    }

    @Test
    void shouldAddTwoPositiveWholeNumbers() {
        Assertions.assertEquals(new Fraction(6), new Fraction(1).plus(new Fraction(5)));
    }

    @Test
    void shouldAddTwoWholeNumbers() {
        Assertions.assertEquals(new Fraction(-4), new Fraction(1).plus(new Fraction(-5)));
    }

    @Test
    void shouldAddFractionsWithEqualDenominator() {
        Assertions.assertEquals(new Fraction(3, 5),
                new Fraction(1, 5).plus(new Fraction(2, 5)));
    }
}
