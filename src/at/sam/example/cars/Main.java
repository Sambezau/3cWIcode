package at.sam.example.cars;


public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(2000, Engine.Type.Gas);
        Manufacturer m1 = new Manufacturer("Toyota", "Japan", 10, 20999);
        Car c1 = new Car(300,7, "Black");

        System.out.println(m1.Name);
        System.out.println(m1.Country);
        System.out.println(m1.Baseprice);
        System.out.println(c1.getCarprice());







    }
}
