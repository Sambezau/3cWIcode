import java.util.Random;

public class while_loop1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        int a = 0;
        do{
        int randomValue = random.nextInt(10,30);
            System.out.println("Nr:" + randomValue);

            if (randomValue== 15 || randomValue== 25){
                isFinished=true;

            }
            else {
                a = a + randomValue;
            }

        }while (!isFinished);
        System.out.println(a);
    }

}
