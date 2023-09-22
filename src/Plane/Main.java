package Plane;

public class Main {
    public static void main(String[] args) {


        Plane plane = new Plane(30,10,10,90,1000,30000,300);
        Engine engine = new Engine(10000,4,2000);
        Fueltank fueltank = new Fueltank(900, Fueltank.TYP.Kerosin);
        Airport airport = new Airport(20, 15,100,935,10);
        Hangar hangar = new Hangar(5,10,20,50,30,new Plane(10,10,10,10,2000,10000,300));
        Fighterjet fighterjet = new Fighterjet(6, 3,3,9,2000,5000,2);

        plane.flight();
        plane.start();

        engine.start();
        engine.stop();

        fueltank.full();
        fueltank.empty();

        airport.checkin();
        airport.checkout();

        hangar.open();
        hangar.close();

        fighterjet.shoot();
        fighterjet.scan();
    }

}
