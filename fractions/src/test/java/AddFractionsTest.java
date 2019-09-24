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

    @Test
    void shouldAddFractionsWithEqualDenominatorAndReduceResult() {
        Assertions.assertEquals(new Fraction(1, 2),
                new Fraction(1, 4).plus(new Fraction(1, 4)));

    }

    @Test
    void shouldAddFractionsWithDifferentDenominators() {
        Assertions.assertEquals(new Fraction(5, 6),
                new Fraction(1, 2).plus(new Fraction(1, 3)));
    }

    @Test
    void shouldAddFractionsWithDifferentDenominatorsAndReduceResult() {
        Assertions.assertEquals(new Fraction(5, 12),
                new Fraction(1, 4).plus(new Fraction(1, 6)));
    }
}
