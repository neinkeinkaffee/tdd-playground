public class Fraction {
    private int intValue;

    public Fraction(int numerator) {
        this.intValue = numerator;
    }

    public Fraction plus(Fraction augend) {
        return new Fraction(this.intValue + augend.intValue());
    }

    public int intValue() {
        return intValue;
    }
}
