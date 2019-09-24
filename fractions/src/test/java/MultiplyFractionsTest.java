import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyFractionsTest {

    @Test
    void multiplationByZeroResultsInZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(1, 2).times(new Fraction(0)));
    }
}
