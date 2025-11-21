import java.util.Scanner;
public class Main {
    static class MyInteger {

        private int value;

        public MyInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isEven() {
            return value % 2 == 0;
        }

        public boolean isOdd() {
            return value % 2 != 0;
        }

        public boolean isPrime() {
            return isPrime(value);
        }

        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static boolean isOdd(int n) {
            return n % 2 != 0;
        }

        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        public static boolean isEven(MyInteger obj) {
            return obj.isEven();
        }

        public static boolean isOdd(MyInteger obj) {
            return obj.isOdd();
        }

        public static boolean isPrime(MyInteger obj) {
            return obj.isPrime();
        }

        public boolean equals(int n) {
            return this.value == n;
        }

        public boolean equals(MyInteger obj) {
            return this.value == obj.value;
        }

        public static int parseInt(char[] chars) {
            return Integer.parseInt(new String(chars));
        }

        public static int parseInt(String str) {
            return Integer.parseInt(str);
        }
    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        MyInteger n1 = new MyInteger(s1.nextInt());

        System.out.println("Value: " + n1.getValue());
        System.out.println("Is even? " + n1.isEven());
        System.out.println("Is odd? " + n1.isOdd());
        System.out.println("Is prime? " + n1.isPrime());

        System.out.println("Static isEven(20): " + MyInteger.isEven(20));
        System.out.println("Static isPrime(11): " + MyInteger.isPrime(11));

        System.out.println("Equals 17? " + n1.equals(17));
        System.out.println("Equals new MyInteger(17)? " + n1.equals(new MyInteger(17)));

        char[] arr = {'1', '2', '3', '4'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(arr));

        System.out.println("parseInt(String): " + MyInteger.parseInt("5678"));

        s1.close();
    }
}
