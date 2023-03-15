public class Main {
    public static void main(String[] args) {
        for (int a = 500; a <= 650; a += 10) {
            System.out.println(a);
        }

        int b = 500;
        while (b <= 650) {
            System.out.println(b);
            b += 10;
        }

        int c = 500;
        do {
            System.out.println(c);
            c += 10;
        } while (c<= 650);
    }
}