package Revisional_questions;
import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner kevin = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = kevin.nextInt();
        System.out.println("Enter second number");
        int num2 = kevin.nextInt();
        if (num2 % 2 == 0 && num2 % 2 == 0){
        System.out.println("both numbers are even ");
        }
        else if (num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("both numbers are odd");
        }
        else {
            System.out.println("one number is even and the other is odd");
        }
        kevin.close();
    }
    
}
