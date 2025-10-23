import java.util.Scanner;

public class Main {
    public static double sumMajorDiagonal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] numbers = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = sc.nextDouble();
            }
        }
        System.out.printf("Sum of the elements in the major diagonal is %.2f%n", sumMajorDiagonal(numbers));
    }
}
