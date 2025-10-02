package session3;
import java.util.Scanner;
public class student {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = scanner.nextInt();
        if (age > 18){
            System.out.println("Enter the combination:");
            String combination = scanner.nextLine();
            if (combination == "PCB"){
                System.out.println("Student is admitted");
            }
            else{
                System.out.println("ccombination is not allowed");
            }
        }
        else{
            System.out.println("you are young" );
        }
        scanner.close();



    }
    
}
