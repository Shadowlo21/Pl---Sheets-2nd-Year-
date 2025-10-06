import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter ISBN (9ds) :");
        int[] digits = new int[9];
        for (int i = 0; i < 9; i++) {
            digits[i] = input.nextInt();
        }
        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            checksum += digits[i] * (i + 1);
        }
        checksum %= 11;
        System.out.print("The ISBN-10 number is: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(digits[i]);
        }
    }
}
