import java.util.Scanner;

public class Main {
    public static double minFunc(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        System.out.printf("The minimum number -> %.2f%n", minFunc(numbers));
        sc.close();
    }
}
