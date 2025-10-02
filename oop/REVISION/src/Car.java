public class Car {

      String brand;
      String model;
      String name;
      int year;

      public Car(String brand, String model, String name,int year){
          this.brand = brand;
          this.model =  model;
          this.name = name;
          this.year = year;
      }

      public void drive() {
          System.out.println(brand + " " + model + " " + name + "( "+year +") is driving a car" );
      }
      public static void main(String[]args) {
          Car car1 = new Car("Toyota", "corrolla", "c1", 2020);
          Car car2 = new Car("Toyota", "corrolla", "c1", 2020);

          car1.drive();
          car2.drive();
      }

}
