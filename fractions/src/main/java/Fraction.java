public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        this.numerator = signOfDenominator * numerator;
        this.denominator = signOfDenominator * denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        return (this.getNumerator() == ((Fraction) other).getNumerator()) &&
                (this.getDenominator() == ((Fraction) other).getDenominator());
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction plus(Fraction other) {
        return new Fraction(this.numerator + other.getNumerator(), this.denominator);
    }
}
