package OO.car;

public class car {


        public String color;
        public double fuelConsumtion;
        public String serialnumber;
        public double fuelAmount;

        public void drive(){
            this.fuelAmount = this.fuelAmount - fuelConsumtion;
            System.out.println("Audi is driving");
        }

    }


