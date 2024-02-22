package Shapes;

public class Circle implements Shape {
    private double radius;
    private double pi;
    private double area;
    private double perimeter;

    public Circle() {
        radius = 0;
        pi = 3.14;
        area = 0;
        perimeter = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public double getArea() {
        area = getPi() * (getRadius() * getRadius());
        return area;
    }

    public double getPerimeter() {
        this.perimeter = 2 * getPi() * getRadius();
        return perimeter;
    }
}
