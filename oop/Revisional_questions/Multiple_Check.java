package Revisional_questions;

import java.util.Scanner;

public class Multiple_Check {
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = me.nextInt();

        System.out.print("Enter second number: ");
        int number2 = me.nextInt();

        if (number1 == 0 || number2 == 0) {
            System.out.println("Zero cannot be used ");
        } else {
            if (number1 % number2 == 0) {
                System.out.println(number1 + " is a multiple of " + number2 + ".");
            } else if (number2 % number1 == 0) {
                System.out.println(number2 + " is a multiple of " + number1 + ".");
            } else {
                System.out.println("multiple of the other.");
            }
        }

        me.close();
    }
}
