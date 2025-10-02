package Exercise;

import java.util.Scanner;

public class price_calculation {
    public static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item price:");
        double itemPrice = scanner.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();
        double originalTotal = itemPrice * quantity;
        double discount = 0.20; // 20%
        double discountedPrice = originalTotal * (1 - discount);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Discounted Price: $" + discountedPrice);

        //comparison checker

        System.out.println("\n  Comparison Checker ");
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println(number1 + " > " + number2 + ": " + (number1 > number2));
        System.out.println(number1 + " == " + number2 + ": " + (number1 == number2));
        System.out.println(number1 + " < " + number2 + ": " + (number1 < number2));
        
        scanner.close();
    }
    
}
