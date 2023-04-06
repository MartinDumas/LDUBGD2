import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введіть слово " + i + ": ");
            String word = name.next();
            System.out.println("Перша літера слова " + i + ": " + word.substring(0, 1));
        }

}
}
