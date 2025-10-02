package session3;
import java.util.Scanner;
public class day_of_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the corresponding day of the week:");
        int dayNumber = scanner.nextInt();
        if(dayNumber == 1){
            System.out.println("Monday");
        } 
        else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } 
        else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } 
        else if (dayNumber == 4) {
            System.out.println("Thursday");
        } 
        else if (dayNumber == 5) {
            System.out.println("Friday");
        } 
        else if (dayNumber == 6) {
            System.out.println("Saturday");
        } 
        else if (dayNumber == 7) {
            System.out.println("Sunday");
        } 
        else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
        scanner.close();
    }
    
}
