package Revisional_questions;
import java.util.Scanner;

public class age_checking {
    public static void main(String[] args) {
        Scanner muben = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = muben.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            if (age >= 18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }

            if (age >= 60) {
                System.out.println("You are a senior citizen");
            } else {
                System.out.println("You are not a senior citizen");
            }

            if (age >= 65) {
                System.out.println("You are eligible for pension");
            } else {
                System.out.println("You are not eligible for pension");
            }
        }

        muben.close();
    }
}
