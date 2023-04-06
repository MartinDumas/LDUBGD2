import java.util.Scanner;

public class Task3_another_method {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        double a, b, c;

        System.out.println("Введіть дробове число:");
        if (name.hasNextDouble()) {
            a = name.nextDouble();
        } else {
            System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
            return;
        }

        System.out.println("Введіть дробове число:");
        if (name.hasNextDouble()) {
            b = name.nextDouble();
        } else {
            System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
            return;
        }

        System.out.println("Введіть дробове число:");
        if (name.hasNextDouble()) {
            c = name.nextDouble();
        } else {
            System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
            return;
        }

        double max = Math.max(Math.max(a, b), c);
        System.out.println("Найбільше дробове число із введених: " + max);
    }
}
