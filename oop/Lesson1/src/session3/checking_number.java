package session3;
import java.util.Scanner;
public class checking_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        int total = number1 + number2; 
        if (total > 100) {
            System.out.println("The total is greater than 100");
        } else {
            System.out.println("The total is less than or equal to 100");
        }
        scanner.close();
        
    }
    
}
