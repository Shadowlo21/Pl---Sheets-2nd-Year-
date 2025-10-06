import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 6371.01;
        double[] x1 = new double[2];
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        for (int i = 0; i < x1.length; i++) {
            x1[i] = Math.toRadians(sc.nextDouble());
        }

        double[] x2 = new double[2];
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        for (int i = 0; i < x2.length; i++) {
            x2[i] = Math.toRadians(sc.nextDouble());
        }

        double D = radius * Math.acos(Math.sin(x1[0]) * Math.sin(x2[0]) + Math.cos(x1[0]) * Math.cos(x2[0]) * Math.cos(x1[1] - x2[1]));

        System.out.printf("The distance of the two points is ->  %.2f km\n", D);
    }
}
