import java.util.Scanner;

class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return Math.sqrt(3.0) / 4.0 * Math.pow(getA(), 2);
    }

    public double getSide() {
        return getA();
    }
}

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double leg) {
        super(base, leg, leg);
    }

    @Override
    public double getArea() {
        return getB() * Math.sqrt(Math.pow(getA(), 2) - Math.pow(getB(), 2) / 4) / 2.0;
    }

    public double getBase() {
        return getA();
    }

    public double getLeg() {
        return getB();
    }
}

class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));
    }

    @Override
    public double getArea() {
        return getA() * getB() / 2.0;
    }

    public double getBase() {
        return getA();
    }

    public double getHeight() {
        return getB();
    }

    public double getHypotenuse() {
        return getC();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner martin = new Scanner(System.in);

        System.out.println("Виберіть тип трикутника:");
        System.out.println("1. Звичайний трикутник");
        System.out.println("2. Рівносторонній трикутник");
        System.out.println("3. Рівнобедрений трикутник");
        System.out.println("4. Прямокутний трикутник");

        int choice = martin.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введіть довжини сторін звичайного трикутника:");
                double a = martin.nextDouble();
                double b = martin.nextDouble();
                double c = martin.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("Периметр трикутника: " + triangle.getPerimeter());
                System.out.println("Площа трикутника: " + triangle.getArea());
                break;

            case 2:
                System.out.println("Введіть довжину сторони рівностороннього трикутника:");
                double side = martin.nextDouble();
                EquilateralTriangle equilateralTriangle = new EquilateralTriangle(side);
                System.out.println("Периметр трикутника: " + equilateralTriangle.getPerimeter());
                System.out.println("Площа трикутника: " + equilateralTriangle.getArea());
                break;

            case 3:
                System.out.println("Введіть довжину основи і довжину однієї зі сторін рівнобедреного трикутника:");
                double base = martin.nextDouble();
                double leg =martin.nextDouble();
                IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(base, leg);
                System.out.println("Периметр трикутника: " + isoscelesTriangle.getPerimeter());
                System.out.println("Площа трикутника: " + isoscelesTriangle.getArea());
                break;

            case 4:
                System.out.println("Введіть довжину основи і довжину висоти прямокутного трикутника:");
                double base2 = martin.nextDouble();
                double height = martin.nextDouble();
                RightTriangle rightTriangle = new RightTriangle(base2, height);
                System.out.println("Периметр трикутника: " + rightTriangle.getPerimeter());
                System.out.println("Площа трикутника: " + rightTriangle.getArea());
                break;

            default:
                System.out.println("Некоректний вибір.");
                break;
        }
    }
}

