package Revisional_questions;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100){
        if (score >= 90) {
            System.out.println("Grade: A");
        } else {
            if (score >= 80) {
                System.out.println("Grade: B");
            } else {
                if (score >= 70) {
                    System.out.println("Grade: C");
                } else {
                    if (score >= 60) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }
                }
            }
        }
        } else {
            System.out.println("Invalid score.");
        }

        scanner.close();
                    }
                }