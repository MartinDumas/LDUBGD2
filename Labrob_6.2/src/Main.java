public class Main {
    public static void main(String[] args) {
//  екземпляри класів трикутників
        EquilateralTriangle eqTriangle = new EquilateralTriangle(5.0);
        IsoscelesTriangle isoTriangle = new IsoscelesTriangle(4.0, 4.0, 6.0);
        RightTriangle rtTriangle = new RightTriangle(3.0, 4.0, 5.0);
        //  методи для обчислення площі та периметру трикутників
        System.out.println("Equilateral Triangle:");
        System.out.println("Area: " + eqTriangle.calculateArea());
        System.out.println("Perimeter: " + eqTriangle.calculatePerimeter());

        System.out.println("Isosceles Triangle:");
        System.out.println("Area: " + isoTriangle.calculateArea());
        System.out.println("Perimeter: " + isoTriangle.calculatePerimeter());

        System.out.println("Right Triangle:");
        System.out.println("Area: " + rtTriangle.calculateArea());
        System.out.println("Perimeter: " + rtTriangle.calculatePerimeter());
    }

}