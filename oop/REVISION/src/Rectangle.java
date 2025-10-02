public class Rectangle {
     double length;
     double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + r1.area());
        System.out.println("Perimeter of rectangle:" + r1.perimeter());
    }
}
