import java.util.Random;

public class Loop1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(5);


        int a = 0;

        for (int i = 1; i <= 100; i++) {
          a = a + i;
            System.out.println(i);
        }

        System.out.println(a);
    }
}

