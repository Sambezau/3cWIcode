package Plane;

public class Airport {
    private int area;
    private int runways;
    private int capacity;
    private int employees;
    private int gates;

    public Airport(int area, int runways, int capacity, int employees, int gates) {
        this.area = area;
        this.runways = runways;
        this.capacity = capacity;
        this.employees = employees;
        this.gates = gates;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }
    public void checkin(){
        System.out.println("Passanger checked in");
    }
    public void checkout(){
        System.out.println("Passanger checked out");
    }
    public void passportcontroll(){
        System.out.println("Pass wird kontrolliert");
    }
}
