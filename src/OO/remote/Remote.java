package OO.remote;

public class Remote {
    private Battery B1;
    private Battery B2;
    private double state;

    public Remote(Battery b1, Battery b2) {
        B1 = b1;
        B2 = b2;
    }
    public String TurnOn(){

        System.out.println("Verbraucher angeschlossen");
    }y

}

