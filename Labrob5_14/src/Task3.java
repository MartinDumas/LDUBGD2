import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        int count = 0;
        double max = Double.NEGATIVE_INFINITY;

        while (count<3){
            System.out.print("Введіть дробове число:");
            if (name.hasNextDouble()){
                double num = name.nextDouble();
                if (num > max){
                    max = num;
                }
                count++;
            } else {
                System.out.println("Ви ввели не дробове число, спробуйте, будь ласка, ще раз:");
                name.next();
            }
        }
        System.out.println("Найбільше дробове число:" + max);
    }
}
