package Exercise;

import java.util.Scanner;
public class area_of_circle {
    public static void main(String[]args){
//###first method
        //using scanner for user input
        Scanner scanner = new Scanner(System.in);
        final double const_pi = 3.14;// declaring pi as constant value
        System.out.println("Enter the radius of your circle");
        double radius = scanner.nextInt();
        double area = radius * radius * const_pi;// area calculation formula
        System.out.println("The area of your circle is : " + area);

        scanner.close();
//###second method
        //using hardcoded value without scanner user input
    //int radius = 5;
    //double area = radius * radius * 3.14;
    //System.out.println("The area of your circle is : " + area);

    }
    
}
