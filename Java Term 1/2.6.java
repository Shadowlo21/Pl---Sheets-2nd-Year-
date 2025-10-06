import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digit -> ");
        int digit = input.nextInt();

        if (digit < 0 || digit > 1000) {
            System.out.print("Error: digit must be between 0 and 1000.");
            return;
        }

        int sum = 0;
        while (digit > 0) {
            sum += digit % 10;
            digit = digit / 10;
        }
        System.out.printf("The sum is %d", sum);
    }
}
