package oo.cars;

import OO.car.Engine;

public class Car {

    public Engine engine;
    public String color;
    public double fuelConsumption;
    public String serialnumber;
    public double fuelAmount;
    public int speed;
    public int amountOfRepetitions;
    public int getRemainingRange;

    public Car(Engine engine, String color ){
        this.color = color;
        this.engine = engine;
    }



    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        this.speed = 100;
        System.out.println("gt86 is driving");
    }

    public void dobreak() {
        this.speed = 0;
        System.out.println("Ich bremse");
        System.out.println(speed + " km/h");
    }

    public void turboBoost() {
        if (this.fuelAmount < 0.6) {
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enouth fuel to go SuperBoost");
        }
    }

    public void honk() {
        System.out.println("Ich habe die Farbe" + this.color + "und habe " + this.engine().getHorsePower() + " ps");
    }

    public void getRemainingRange() {
        System.out.println("Verbleibende Reichweite");
        this.getRemainingRange = (int) (this.fuelAmount/this.fuelConsumption * 100);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setGetRemainingRange(int getRemainingRange) {
        this.getRemainingRange = getRemainingRange;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}











































