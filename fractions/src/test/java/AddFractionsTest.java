import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddFractionsTest {
    @Test
    void shouldAddZeroAndZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        Assertions.assertEquals(0, sum.intValue());
    }

    @Test
    void shouldAddOneAndZero() {
        Fraction sum = new Fraction(1).plus(new Fraction(0));
        Assertions.assertEquals(1, sum.intValue());
    }

    @Test
    void shouldAddTwoWholeNumbers() {
        Fraction sum = new Fraction(1).plus(new Fraction(5));
        Assertions.assertEquals(6, sum.intValue());
    }
}
