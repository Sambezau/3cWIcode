import java.util.Random;

public class Loop2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(5);


        int a = 0;

        for (int i = 2; i <= 1000; i+=2 ) {
            a = a + i;
            System.out.println(i);
        }

        System.out.println(a);
    }
}