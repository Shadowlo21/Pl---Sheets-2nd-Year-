import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int tuition = 10000;
          for (int i = 1; i <= 10; i++) {
              tuition = tuition + 500;
          }
        for (int i = 1; i <= 4; i++) {
            tuition = tuition + 500;
        }
        System.out.printf("tuition of 4th Year After 10th Year -> %d $\n", tuition);
        //Onther method just do System.out.printf("tuition of 4th Year After 10th Year -> %d $\n", 10000 + (500 * 14));
    }
}
