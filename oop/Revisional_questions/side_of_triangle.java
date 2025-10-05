package Revisional_questions;
import  java.util.Scanner;
public class side_of_triangle {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The numbers " + a + ", " + b + ", and " + c + " can form a triangle.");
        } else {
            System.out.println("The numbers " + a + ", " + b + ", and " + c + " cannot form a triangle.");
        }
        scanner.close();
    }
}
