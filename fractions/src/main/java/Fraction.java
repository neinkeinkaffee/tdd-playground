public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        int gcd = gcd(numerator, denominator);
        this.numerator = signOfDenominator * numerator / gcd;
        this.denominator = signOfDenominator * denominator / gcd;
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

    private int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
