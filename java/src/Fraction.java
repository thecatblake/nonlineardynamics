import java.math.BigInteger;

public record Fraction(BigInteger numerator, BigInteger denominator) {
    public Fraction add(Fraction other) {
        return new Fraction(numerator.multiply(other.denominator).add(other.numerator.multiply(denominator)), denominator.multiply(other.denominator));
    }

    public Fraction subtract(Fraction other) {
        return new Fraction(numerator.multiply(other.denominator).subtract(other.numerator.multiply(denominator)), denominator.multiply(other.denominator));
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(numerator.multiply(other.numerator), denominator.multiply(other.denominator));
    }

    public Fraction divide(Fraction other) {
        return new Fraction(numerator.multiply(other.denominator), denominator.multiply(other.numerator));
    }

    @Override
    public String toString() {
        return numerator.toString() + "/" + denominator.toString();
    }
}
