public class Main {
    public static void main(String[] args) {
        int n = 10;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа " + n + " дорівнює " + factorial);

        //with while:

        int m = 10;
        int factor = 1;
        int o = 1;
        while (o <= n) {
            factor *= o;
            o++;
        }
        System.out.println("Факторіал числа " + m + " дорівнює " + factor);
    }
}