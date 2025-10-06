import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius -> ");
        float Radius = input.nextFloat();
        System.out.print("Enter length -> ");
        float Length = input.nextFloat();

        float area = (float) (Radius * Radius * Math.PI);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("volume : %.2f%n", area * Length);
    }
}
