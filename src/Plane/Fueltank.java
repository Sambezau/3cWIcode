package Plane;

public class Fueltank {
    private double capacity;
    public TYP typ;
    public enum TYP{Kerosin};

    public Fueltank(double capacity, TYP typ) {
        this.capacity = capacity;
        this.typ = typ;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public TYP getTyp() {
        return typ;
    }

    public void setTyp(TYP typ) {
        this.typ = typ;
    }

    public void full(){
        System.out.println("Tank ist voll");
    }
    public void empty(){
        System.out.println("Tank ist leer");
    }
}
