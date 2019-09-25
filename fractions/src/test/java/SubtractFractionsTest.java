import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SubtractFractionsTest {

    @Test
    void subtractingZeroResultsInSameNumber() {
        Assertions.assertEquals(new Fraction(1, 2), new Fraction(1, 2).minus(new Fraction(0)));
    }

    @Test
    void subtractingFractionWithCommonDenominator() {
        Assertions.assertEquals(new Fraction(5, 3), new Fraction(7,3).minus(new Fraction(2, 3)));
    }

    @Test
    void subtractingFractionWithDifferentDenominator() {
        Assertions.assertEquals(new Fraction(29, 15), new Fraction(7,3).minus(new Fraction(2, 5)));
    }

    @Test
    void subtractingFractionWithDifferentDenominatorAndCommonDivisor() {
        Assertions.assertEquals(new Fraction(3, 2), new Fraction(7,3).minus(new Fraction(5, 6)));
    }

    @Test
    void subtractingWholeNumberWithPositiveResult() {
        Assertions.assertEquals(new Fraction(1, 2), new Fraction(3, 2).minus(new Fraction(1)));
        Assertions.assertEquals(new Fraction(3, 2), new Fraction(5, 2).minus(new Fraction(1)));
    }

    @Test
    void subtractingWholeNumberWithNegativeResult() {
        Assertions.assertEquals(new Fraction(-1, 2), new Fraction(1, 2).minus(new Fraction(1)));
    }
}
