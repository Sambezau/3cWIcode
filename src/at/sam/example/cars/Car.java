package at.sam.example.cars;



public class Car {
    public String Color;
    public double Maxspeed;
    public double Baseconsumtion;
    public Manufacturer manufacturer;
    public String Engine;
    public double Price;
    public double Carprice;





    public Car(double maxspeed, double baseconsumtion, String color) {
        Maxspeed = maxspeed;
        Baseconsumtion = baseconsumtion;
        Color = color;



    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getMaxspeed() {
        return Maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        Maxspeed = maxspeed;
    }

    public double getBaseconsumtion() {
        return Baseconsumtion;
    }

    public void setBaseconsumtion(double baseconsumtion) {
        Baseconsumtion = baseconsumtion;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getCarprice() {
        return Carprice;
    }

    public void setCarprice(double carprice) {
        Carprice = carprice;
    }






}
