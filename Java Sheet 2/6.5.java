import java.util.Scanner;
public class Main {
    public static long SortNum(long n1, long n2, long n3) {
        long max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        long min = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
        long mid = (n1 + n2 + n3) - (max + min);
        System.out.printf("Sorted (increasing): %d, %d, %d%n", min, mid, max);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1, n2, n3;
        System.out.print("Enter number 1: ");
        n1 = sc.nextLong();
        System.out.print("Enter number 2: ");
        n2 = sc.nextLong();
        System.out.print("Enter number 3: ");
        n3 = sc.nextLong();
        SortNum(n1, n2, n3);
    }
}
