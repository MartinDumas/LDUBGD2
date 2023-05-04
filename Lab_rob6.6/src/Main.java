class Triangle {
    public double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        return Math.sqrt(3.0) / 4.0 * Math.pow(getSide(), 2);
    }

    public double getSide() {
        return super.a;
    }
}

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double leg) {
        super(base, leg, leg);
    }

    @Override
    public double getArea() {
        return super.b * Math.sqrt(Math.pow(super.a, 2) - Math.pow(super.b, 2) / 4) / 2.0;
    }

    public double getBase() {
        return super.a;
    }

    public double getLeg() {
        return super.b;
    }
}

class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));
    }

    @Override
    public double getArea() {
        return super.a * super.b / 2.0;
    }

    public double getBase() {
        return super.a;
    }

    public double getHeight() {
        return super.b;
    }

    public double getHypotenuse() {
        return super.c;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Perimeter of triangle1: " + triangle1.getPerimeter());
        System.out.println("Area of triangle1: " + triangle1.getArea());

        EquilateralTriangle triangle2 = new EquilateralTriangle(5.0);
        System.out.println("Perimeter of triangle2: " + triangle2.getPerimeter());
        System.out.println("Area of triangle2: " + triangle2.getArea());

        IsoscelesTriangle triangle3 = new IsoscelesTriangle(4.0, 3.0);
        System.out.println("Perimeter of triangle3: " + triangle3.getPerimeter());
        System.out.println("Area of triangle3: " + triangle3.getArea());

        RightTriangle triangle4 = new RightTriangle(3.0, 4.0);
        System.out.println("Perimeter of triangle4: " + triangle4.getPerimeter());
        System.out.println("Area of triangle4: " + triangle4.getArea());
    }
}
