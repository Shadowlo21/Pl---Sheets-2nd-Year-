import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String n) {
        boolean ispali = true;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
                ispali = false;
            }
        }
        return ispali;
    }
    public static String reverseString(String input) {
        String output = new StringBuilder(input).reverse().toString();
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.nextLine();
        System.out.printf("is the number palindrome: %s%n", isPalindrome(n));
        System.out.printf("reversed number is %s%n", reverseString(n));

        sc.close();
    }
}
