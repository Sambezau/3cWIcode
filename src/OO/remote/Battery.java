package OO.remote;

public class Battery {
    private double state ;

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    public Battery(double state) {
        this.state = state;
    }
}
