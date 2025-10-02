import java.util.Scanner;
public class Learner {
    String name;
    int age;
    float grade;
public void student(String name, int age, float grade){
    this.name = name;
    this.age = age;
    this.grade =grade;
}
    // method for calling display information

    public void displayInfo() {
        System.out.println("Learner Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }


    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        //asking user to enter learner's details
        System.out.println("Enter learner's name:");
        String name = scanner.next();
        System.out.println("Enter learners age:");
        int age = scanner.nextInt();
        System.out.println("Enter learners grade:");
        float grade = scanner.nextFloat();
    }


}
