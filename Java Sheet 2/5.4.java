import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mile =  sc.nextDouble();
        System.out.printf("Kilometers: %.2f\n", mile * 1.609);
    }
}
