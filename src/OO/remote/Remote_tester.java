package OO.remote;

public class Remote_tester {
    public static void main(String[] args) {
        Battery B1 = new Battery(60);
        Battery B2 = new Battery(50);
        System.out.println(B1.getState());
        System.out.println(B2.getState());
        System.out.println();

    }


}
