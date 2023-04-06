import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String sentence = "";
        for (int i = 1; i <6; i++){
            System.out.print("Введіть слово:");
            if (name.hasNext());
            String word = name.next();
            sentence = sentence.concat(word + " ");
        }
        System.out.println(sentence.trim() + ".");
    }
}
