public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                int h1 = i / 10;
                int h2 = i % 10;
                int m1 = j / 10;
                int m2 = j % 10;
                if (h1 == m2 && h2 == m1) {
                    count++;
                }
            }
        }
        System.out.println("Кількість співпадінь симетричних комбінацій цифр на годиннику: " + count);
    }
}