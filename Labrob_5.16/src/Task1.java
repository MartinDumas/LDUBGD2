import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //with math.random
        int a = (int) (Math.random()*41-20);
        System.out.println("Випадкове натуральне число на проміжку [-20;20]:" + a);

        //with Random
        Random martin = new Random();
        int randomnum = martin.nextInt(41)-20;
        System.out.println("Випадкове натуральне число на проміжку [-20;20]:" + randomnum);

    }
}