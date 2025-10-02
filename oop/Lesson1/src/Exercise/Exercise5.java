package Exercise;

public class Exercise5 {
    public static void main(String[] args) {

        // 46. Simple Calculator
        System.out.println(" Simple Calculator ");
        double num1 = 12.0;
        double num2 = 3.0;
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));

        // 47. Temperature Converter
        System.out.println("\n Temperature Converter ");
        double fahrenheit = 72.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "F is " + celsius + "C");

        // 48. Student Info Card
        System.out.println("\n Student Info Card");
        String name = "Uwitonze pacific";
        int age = 20;
        char grade = 'B';
        double averageGrade = 60.6;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Average Grade: " + averageGrade + "%");

        // 49. Price Calculator
        System.out.println("\n Price Calculator");
        double itemPrice = 9.99;
        int quantity = 5;
        double originalTotal = itemPrice * quantity;
        double discount = 0.20; // 20%
        double discountedPrice = originalTotal * (1 - discount);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Discounted Price: $" + discountedPrice);

        // 50. Comparison Checker
        System.out.println("\n  Comparison Checker ");
        int number1 = 25;
        int number2 = 30;
        System.out.println(number1 + " > " + number2 + ": " + (number1 > number2));
        System.out.println(number1 + " == " + number2 + ": " + (number1 == number2));
        System.out.println(number1 + " < " + number2 + ": " + (number1 < number2));
    }
}