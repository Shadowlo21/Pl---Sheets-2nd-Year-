import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal -> ");
        float subtotal = input.nextFloat();
        System.out.print("Enter gratuity -> ");
        float gratuity = input.nextFloat();

        double Finalgratuity = subtotal * (gratuity / 100.0);
        double total = subtotal + Finalgratuity;
        System.out.printf("Finalgratuity: %.2f%n", Finalgratuity);
        System.out.printf("total : %.2f%n", total );
    }
}
