import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyFractionsTest {

    @Test
    void multiplationByZeroResultsInZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(1, 2).times(new Fraction(0)));
    }

    @Test
    void multiplicationByOneResultsInSameNumber() {
        Assertions.assertEquals(new Fraction(1, 2), new Fraction(1, 2).times(new Fraction(1)));
        Assertions.assertEquals(new Fraction(-1, 2), new Fraction(-1, 2).times(new Fraction(1)));
    }

    @Test
    void multiplicationByNegativeOneResultsInSameNumberButNegativeSign() {
        Assertions.assertEquals(new Fraction(-1, 2), new Fraction(1, 2).times(new Fraction(-1)));
    }
}
