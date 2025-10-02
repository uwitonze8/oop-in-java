package Exercise;

public class increment_test {
     public static void main(String[] args) {
        int x = 10;//initial value of x is 10
        int y = ++x + x++;// y=11+11=22, x=12   

        System.out.println("x = " + x);
        System.out.println("y = " + y);
     }
}
