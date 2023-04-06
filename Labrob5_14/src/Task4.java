import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner martin = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = martin.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = martin.nextLine();

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Імена однакові.");
        } else {
            System.out.println("Імена різні.");
        }
    }
}
