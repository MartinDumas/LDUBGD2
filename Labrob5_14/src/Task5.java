import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner martin = new Scanner(System.in);

        System.out.println("Введіть, будь ласка, перший рядок:");
        String firstSentence = martin.nextLine();

        System.out.println("Введіть, будь ласка, другий рядок:");
        String secondSentence = martin.nextLine();

        int a = firstSentence.length();
        int b = secondSentence.length();
        if (a>b){
            System.out.println("Перший рядок більший за другий");
        } else{
            System.out.println("Другий рядок більший за перший");
        }

    }
}
