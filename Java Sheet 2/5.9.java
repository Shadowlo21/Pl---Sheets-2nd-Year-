import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // next line shit
        String[][] array = new String[numStudents][2];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            array[i][0] = sc.nextLine();
            System.out.print("Enter student score: ");
            array[i][1] = sc.nextLine();
        }
        int maxScore = Integer.parseInt(array[0][1]);
        String topStudent = array[0][0];
        for (int i = 0; i < numStudents; i++) {
            if (Integer.parseInt(array[i][1]) > maxScore) {
                maxScore = Integer.parseInt(array[i][1]);
                topStudent = array[i][0];
            }
        }
        System.out.printf("\nHighest Student Name -> %s and Score is %d%n", topStudent, maxScore);
    }
}
