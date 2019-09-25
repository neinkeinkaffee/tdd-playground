import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideByFractionTest {

    @Test
    void dividingByOneResultsInSameNumber() {
        Assertions.assertEquals(new Fraction(3, 4), new Fraction(3, 4).by(new Fraction(1)));
    }

    @Test
    void dividingByWholeNumber() {
        Assertions.assertEquals(new Fraction(1, 4), new Fraction(3, 4).by(new Fraction(3)));
        Assertions.assertEquals(new Fraction(3, 8), new Fraction(3, 4).by(new Fraction(2)));
    }

    @Test
    void dividingByFraction() {
        Assertions.assertEquals(new Fraction(15, 4), new Fraction(3, 4).by(new Fraction(1, 5)));
    }

    @Test
    void dividingByFractionAndRducingResult() {
        Assertions.assertEquals(new Fraction(9, 2), new Fraction(3, 4).by(new Fraction(1, 6)));
    }
}
