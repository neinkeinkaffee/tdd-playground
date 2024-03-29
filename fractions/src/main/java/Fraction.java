public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        int gcd = NumberTheory.gcd(numerator, denominator);
        this.numerator = signOfDenominator * numerator / gcd;
        this.denominator = signOfDenominator * denominator / gcd;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    @Override
    public int hashCode() {
        return this.numerator * 19 + this.denominator;
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
        return new Fraction(this.numerator * other.getDenominator() + other.getNumerator() * this.getDenominator(), this.denominator * other.getDenominator());
    }

    public Fraction times(Fraction other) {
        return new Fraction(this.numerator * other.getNumerator(), this.denominator * other.getDenominator());
    }

    public Fraction minus(Fraction other) {
        return this.plus(other.times(-1));
    }

    public Fraction times(int scalar) {
        return this.times(new Fraction(scalar));
    }

    public Fraction by(Fraction other) {
        return this.times(new Fraction(other.getDenominator(), other.getNumerator()));
    }
}
