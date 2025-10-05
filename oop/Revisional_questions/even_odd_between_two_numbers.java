package Revisional_questions;
import java.util.Scanner;

public class even_odd_between_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd.");
        } else {
            System.out.println("One number is even and the other is odd.");
        }

        scanner.close();
    }
}
