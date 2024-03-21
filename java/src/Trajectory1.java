import java.math.BigInteger;

public class Trajectory1 {
    public static void main(String[] args) {
        BigInteger X = new BigInteger("998123456789");
        BigInteger TWO = new BigInteger("2");
        BigInteger THREE = new BigInteger("3");
        int T = 350;
        for (int t=0; t < T; t++) {
            if (X.mod(TWO).equals(BigInteger.ZERO)) X = X.divide(TWO);
            else X = X.multiply(THREE).add(BigInteger.ONE);
            System.out.println(X);
        }
    }
}
