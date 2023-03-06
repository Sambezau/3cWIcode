package OO.remote;

public class Remote {
    private Battery B1;
    private Battery B2;
    private double state;

    public Remote(Battery B1, Battery B2) {
        this.B1 = B1;
        this.B2 = B2;
    }


    public double getStatus() {
        double state = (B1.getState() + B2.getState()) / 2;
        return state;
    }

    public String TurnOn() {

        String on = "Verbraucher angeschlossen";
        double newStatebattery1 = this.B1.getState() * 0.95;
        this.B1.setState(newStatebattery1);
        double newStatebattery2 = this.B2.getState() * 0.95;
        this.B2.setState(newStatebattery2);

        System.out.println("Der Batteriestand 1 ist bei " + newStatebattery1 + "Prozent");
        System.out.println("Der Batteriestand 2 ist bei " + newStatebattery2 + "Prozent");
        return on;
    }

    public String TurnOff() {
        String off = "Kein Verbraucher angeschlossen";
        return off;
    }

}

