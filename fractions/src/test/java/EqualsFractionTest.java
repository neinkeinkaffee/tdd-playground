import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

public class EqualsFractionTest {
    @Test
    void zeroShouldEqualZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(0));
    }

    @Test
    void wholeNumberShouldEqualWholeNumber() {
        Assertions.assertEquals(new Fraction(4), new Fraction(4));
    }

    @Test
    void fractionShouldEqualFractionWithSameNumerator() {
        Assertions.assertEquals(new Fraction(1, 4), new Fraction(1,4));
    }

    @Test
    void fractionShouldNotEqualFractionWithDifferentDenominator() {
        Assertions.assertNotEquals(new Fraction(1, 4), new Fraction(1,5));
    }

    @Test
    void fractionShouldEqualWholeNumber() {
        Assertions.assertEquals(new Fraction(4), new Fraction(4, 1));
    }

    @Test
    void fractionWithNegativeNumeratorShouldEqualFractionWithNegativeDenominator() {
        Assertions.assertEquals(new Fraction(-1, 4), new Fraction(1,-4));
    }
}
