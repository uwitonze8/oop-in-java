package loops;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = scanner.nextInt();
        if (marks < 0 || marks >100){
            System.out.println("enter valid marks");
        }
        if (marks >= 90) {
            System.out.println("Excellent");
        } 
        else if (marks >= 80 && marks < 90) {
            System.out.println("Good");
        } 
        else if (marks >= 60 && marks < 80) {
            System.out.println("Pass");
        } 
        else {
            System.out.println("Failure");
        }
        scanner.close();
    }
}
