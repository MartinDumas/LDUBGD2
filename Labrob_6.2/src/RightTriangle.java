public class RightTriangle {
    public double base;
    public double height;
    public double hypotenuse;
    public RightTriangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }


    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return base + height + hypotenuse;
    }

}