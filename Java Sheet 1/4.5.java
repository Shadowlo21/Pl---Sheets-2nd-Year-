import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 6371.01;
        System.out.print("Enter The nums of the Side : ");
        double sides= sc.nextDouble();
        System.out.print("Enter The the Side : ");
        double side = sc.nextDouble();

        double area = (sides * (side * side)) / (4 * Math.tan(Math.PI / sides));
        System.out.printf("The area of the polygon is : %f", area);
    }
}
