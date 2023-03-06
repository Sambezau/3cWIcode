package OO.remote;

public class Remote_tester {
    public static void main(String[] args) {
        Battery B1 = new Battery(100);
        Battery B2 = new Battery(90);
        System.out.println(B1.getState());
        System.out.println(B2.getState());
       Remote Remote1 = new Remote(B1,B2);
        System.out.println(Remote1.TurnOn());
        System.out.println(Remote1.TurnOff());
        System.out.println(Remote1.getStatus());



    }


}
