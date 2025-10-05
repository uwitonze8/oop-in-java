package Revisional_questions;

import java.util.Scanner;

public class leap_year {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a year :");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ){
            System.out.println(" leap");
        }
        else{
            System.out.println("Not leap year");
        }
        scanner.close();

}

}
