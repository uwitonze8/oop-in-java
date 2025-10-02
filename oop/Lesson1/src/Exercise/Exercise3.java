package Exercise;

public class Exercise3 {
    public static  void main (String[] args){
        // 21. Declare two integers a and b with values 10 and 5. Print their sum.
        int a = 10;
        int b = 5;
        System.out.println("Sum is : " + (a + b));

        // 22. Using the same variables a and b, print the result of a - b.
        System.out.println("Difference is : " + (a - b));

        // 23. Print the result of a * b.
        System.out.println("Product is : " + (a * b));

        // 24. Print the result of a / b. (What is the result? Why?)
        System.out.println("Integer Division (a / b): " + (a / b));  //Result is 2 because both a and b are integers

        // 25. Declare two double variables num1 and num2 with values 10 and 3. Print num1 / num2.
        double num1 = 10;
        double num2 = 3;
        System.out.println("Double Division (num1 / num2): " + (num1 / num2)); // Compared to above , this gives a decimal (3.333...) instead of integer result.

        // 26. Calculate and print the remainder when 15 is divided by 4 (use modulus operator %).
        System.out.println("Remainder of 15 % 4: " + (15 % 4));

        // 27. Calculate the area of a rectangle (length * width). Store and print it.
        int length = 7;
        int width = 4;
        int area = length * width;
        System.out.println("Area of rectangle: " + area);

        // 28. Increment the value of a variable count (start from 0) by 1 and print.
        int count = 0;
        count++;
        System.out.println("Count after increment: " + count);

        // 30. Add 5 to a variable score (initialized to 10) and print.
        int score = 10;
        score += 5;
        System.out.println("Score after adding 5: " + score);

        // 31. Subtract 3 from a variable score and print.
        score -= 3;
        System.out.println("Score after subtracting 3: " + score);

        // 32. Multiply a variable value by 2 and print.
        int value = 6;
        value *= 2;
        System.out.println("Value after multiplying by 2: " + value);

        // 33. Divide a variable total by 4 and print.
        int total = 20;
        total /= 4;
        System.out.println("Total after dividing by 4: " + total);

        // 34. Calculate total cost of 3 items (2.50, 3.75, 1.99).
        double item1 = 2.50;
        double item2 = 3.75;
        double item3 = 1.99;
        double totalCost = item1 + item2 + item3;
        System.out.println("Total cost of items: $" + totalCost);

        // 35. Convert 100°F to Celsius: C = (F - 32) * 5/9
        double F = 100;
        double C = (F - 32) * 5.0 / 9.0;
        System.out.println("100°F in Celsius: " + C);

    }
}
