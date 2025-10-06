import java.util.Scanner;
import java.util.Random;



public class Main {
    public static  String GetDay(int dayIndex){
        String dayName = "";
        switch (dayIndex) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            default: dayName = "Invalid day"; break;
        }
        return dayName;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter Todays Day :");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int elapsed = input.nextInt();
        System.out.printf("Day gonna be -> %s",GetDay(day+elapsed));
    }
}
