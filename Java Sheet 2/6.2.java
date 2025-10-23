import java.util.Scanner;
public class Main {
    public static long SumDigits(long n) {
        long result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Sum of digits = " + SumDigits(n));
        sc.close();
    }
}
