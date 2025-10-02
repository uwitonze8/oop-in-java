package Exercise;

import java.util.Scanner;
public class swapping{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);
        //swapping using third variable
        //int temp = number1;
        //number1 = number2;
        //number2 = temp;

        //swapping without using third variable
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        
        System.out.println("After swapping: number1 = " + number1 + ", number2  = " + number2);
        scanner.close();
    }
}