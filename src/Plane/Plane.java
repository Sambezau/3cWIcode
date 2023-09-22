package Plane;

public class Plane {

    private double span;
    private double height;
    private double width;
    private double length;
    private double speed;
    private double weight;
    private int capacity;
    private Engine engine;


    public Plane(double span, double height, double width, double length, double speed, double weight, int capacity) {
        this.span = span;
        this.height = height;
        this.width = width;
        this.length = length;
        this.speed = speed;
        this.weight = weight;
        this.capacity = capacity;
        this.engine = engine;

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getSpan() {
        return span;
    }

    public void setSpan(double span) {
        this.span = span;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void start(){
        System.out.println("Flieger startet");
    }
    public void land(){
        System.out.println("Flieger landet");
    }
    public void flight(){
        System.out.println("Flieger fliegt");
    }
}

