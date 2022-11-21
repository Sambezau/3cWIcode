package OO;

import OO.car.car;

public class ooFirstObject {
    public static void main(String[] args){
        car c1 = new car();
        c1.color = "black";
        c1.fuelConsuption = 5.0;
        c1.serialnumber = "A1234";
        c1.fuelAmount = 30.0;

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
    }
}
