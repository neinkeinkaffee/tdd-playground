import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractFractionsTest {

    @Test
    void subtractingZeroResultsInSameNumber() {
        Assertions.assertEquals(new Fraction(1, 2), new Fraction(1, 2).minus(new Fraction(0)));
    }
}
