package Shapes;

public class Triangle implements Shape {
    private double height;
    private double base;
    private double area;
    private double perimeter;

    public Triangle() {
        height = 0;
        base = 0;
        area = 0;
        perimeter = 0;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        area = (getBase() * getHeight()) / 2;
        return area;
    }

    public double getPerimeter() {
        perimeter = getBase() + getHeight() + (Math.sqrt((getBase() * getBase()) + (getHeight() * getHeight())));
        return perimeter;
    }
}
