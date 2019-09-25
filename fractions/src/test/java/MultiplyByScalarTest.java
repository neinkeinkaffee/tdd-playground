import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyByScalarTest {

    @Test
    void multiplyingWithZeroShouldResultInZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(1).times(0));
    }

    @Test
    void multiplyingWholeNumberWithOneShouldResultInSameNumber() {
        Assertions.assertEquals(new Fraction(4), new Fraction(4).times(1));
    }

    @Test
    void multiplyingFractionWithOneShouldResultInSameNumber() {
        Assertions.assertEquals(new Fraction(4, 3), new Fraction(4, 3).times(1));
    }

    @Test
    void multiplyingFractionWithOtherNumberShouldResultInSameNumber() {
        Assertions.assertEquals(new Fraction(20, 3), new Fraction(4, 3).times(5));
    }
}
