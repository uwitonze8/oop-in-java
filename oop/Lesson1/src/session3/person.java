package session3;
import java.util.Scanner;
public class person {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter  your age :");
           int age = scanner.nextInt();
           if (age > 30){
            System.out.println("the person is old");
           } 
           else {
            System.out.println("the person is young");
           }

            scanner.close();

        // we use else when we have two or more  conditions to check
        }
}
//component of class is methos