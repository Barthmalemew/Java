package Shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle() {
        height = 0;
        width = 0;
        area = 0;
        perimeter = 0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        area = getHeight() * getWidth();
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * (getWidth() + getHeight());
        return perimeter;
    }
}
