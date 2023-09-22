package Plane;

public class Engine {
    private int hp;
    private int Quantity;
    private double weight;

    public Engine(int hp, int quantity, double weight) {
        this.hp = hp;
        Quantity = quantity;
        this.weight = weight;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void start(){
        System.out.println("Motor startet");
    }
    public void stop(){
        System.out.println("Motor stopt");
    }
    public void accelerate(){
        System.out.println("Motor beschleunigt");
    }
}
