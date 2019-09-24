import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsFractionTest {
    @Test
    void ZeroEqualsZero() {
        Assertions.assertEquals(new Fraction(0), new Fraction(0));
    }
}
