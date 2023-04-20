public class IsoscelesTriangle {
    public double side1; // рівні сторони трикутника
    public double side2;
    public double base; // основа трикутника
    public IsoscelesTriangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }

    public double calculateArea() {
        double height = Math.sqrt(side1 * side1 - (base * base / 4));
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return side1 + side2 + base;
    }

}