public class House {
    // attributes
    String name;
    String location;
    String size;
    String model;
    // initialization
    public House(String name, String location, String size, String model ){
        this.name = name;
        this.location = location;
        this.size = size;
        this.model = model;

    }
    //new defined method and Method (behavior)

    public void home() {
        System.out.println(name + " " + location + " " + "size" + " " + model);

    }
    //predefined method
    public static void main(String[]args){
        House house1 = new House("uvilla", "kimironko", "four rooms","square");
        house1.home();
    }
}


