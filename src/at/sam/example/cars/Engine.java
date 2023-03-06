package at.sam.example.cars;

public class Engine {
    public enum Type {Diesel,Gas};
    public double Power;

    public Type type;

    public double getPower() {
        return Power;
    }

    public void setPower(double power) {
        Power = power;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Engine(double power, Type engineType) {
        Power = power;
        this.type = engineType;

    }
}
