import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner martin = new Scanner(System.in);
        System.out.println("Введіть довжину першого катету:");
        int a = martin.nextInt();

        System.out.println("Введіть довжину другого катету:");
        int b = martin.nextInt();

        int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Довжину гіпотенузи дорівнює:" + c);

        double p = (double) a + b + c;
        double s = (double) (a*b)/2;

        System.out.println("Периметр трикутника дорівнює:" + p);
        System.out.println("Площа трикутника дорівнює:" + s);

    }
}
