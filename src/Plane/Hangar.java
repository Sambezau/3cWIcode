package Plane;

import java.util.ArrayList;
import java.util.List;



public class Hangar {
    private int quantity;
    private int capacity;
    private double height;
    private double width;
    private double length;
    private Plane plane;


    public Hangar(int quantity, int capacity, double height, double width, double length, Plane plane) {
        this.quantity = quantity;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.length = length;
        this.plane = plane;
    }

    private List<Plane> planes;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
    public void open(){
        System.out.println("Hangar wird geöffnet");
    }
    public void close(){
        System.out.println("Hangar wird geschlossen");
    }
}
