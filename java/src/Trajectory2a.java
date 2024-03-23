import java.math.BigInteger;

public class Trajectory2a {
    public static void main(String[] args) {
        var x = new Fraction(new BigInteger("1"), new BigInteger("3"));
        int T = 10;
        System.out.println("x[0] = " + x);
        for (int t=0; t < T; t++) {
            var one = new Fraction(new BigInteger("1"), new BigInteger("1"));
            var four = new Fraction(new BigInteger("4"), new BigInteger("1"));
            x = four.multiply(x).multiply(one.subtract(x));

            System.out.println("x[" + (t+1) + "] = " + x);
        }
    }
}
