import java.math.BigInteger;
public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("p\t\t2^p - 1");
        for (int p = 2; p <= 100; p++) {
            if (isPrime(p)) {
                BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
                if (mersenne.isProbablePrime(20)) {
                    System.out.println(p + "\t\t" + mersenne);
                }
            }
        }
    }
}
