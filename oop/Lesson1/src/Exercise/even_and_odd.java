package Exercise;

import java.util.Scanner;
public class even_and_odd {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be computed :");
        int number = scanner.nextInt();
        if (number % 2==0){
            System.out.println(number + "   is even number");
        }
        else{
            System.out.println(number + "is odd number");
        }

        scanner.close();
    
    }
}
