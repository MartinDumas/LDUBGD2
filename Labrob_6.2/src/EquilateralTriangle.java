public class EquilateralTriangle {
    public double side;
    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    public double calculatePerimeter() {
        return 3 * side;
    }

}