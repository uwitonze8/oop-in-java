import java.util.Scanner; // importing scanner to read user input

public class Addition{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in); // creating new object scanner
        // Ask user for the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        //calculating sum will be equal to num1 + num2
        double addition = num1 + num2;
        // printing results
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + addition);
        scanner.close();

    }
}
