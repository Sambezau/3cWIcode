package Plane;

public class Fighterjet extends Plane {
    public Fighterjet(double spannweite, double hoehe, double breite, double laenge, double geschwindigkeit, double gewicht, int kapazitaet) {
        super(spannweite, hoehe, breite, laenge, geschwindigkeit, gewicht, kapazitaet);
    }
    public void shoot(){
        System.out.println("F22-FighterJet is shooting");
    }
    public void scan(){
        System.out.println("F22-FighterJet is scaning");
    }
}
