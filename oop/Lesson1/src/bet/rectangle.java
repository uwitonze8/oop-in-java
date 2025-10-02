package bet;
import java.util.Scanner;
public class rectangle {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in) ;
        System.out.println("Enter Length of rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter width of rectangle :");
        int width = scanner.nextInt();
        int  area = length * width;
        System.out.println("the area of rectangle is :" + area);
        scanner.close();

    }
    
}
