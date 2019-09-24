import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReduceFractionsTest {

    @Test
    void fractionWithNegativeNumeratorShouldReduceToFractionWithNegativeDenominator() {
        Assertions.assertEquals(new Fraction(-1, 4), new Fraction(1,-4));
    }
}
