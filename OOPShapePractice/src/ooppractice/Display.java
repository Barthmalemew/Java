package ooppractice;

import java.util.Scanner;

public class Display {
    public int op;
    public double height;
    public double length;
    public double radius;
    public double area;
    public String color;

    public Display() {
        op = 0;
        height = 0;
        length = 0;
        radius = 0;
        area = 0;
        color = "";
    }

    Scanner scr = new Scanner(System.in);

    public void getShape() {
        System.out.println("Select a shape: 1. Circle 2. Rectangle 3. Triangle");
        op = scr.nextInt();
        switch (op) {
            case 1:
                Circle circle1 = new Circle();
                circle1.setColor();
                circle1.setRadius();
                circle1.getArea();
                Circle circle2 = new Circle();
                circle2.setColor();
                circle2.setRadius();
                circle1.addArea(circle2);
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor();
                rectangle.setHeight();
                rectangle.setLength();
                rectangle.getArea();
                break;
            case 3:
                Triangle triangle = new Triangle();
                triangle.setColor();
                triangle.setHeight();
                triangle.setLength();
                triangle.getArea();
                break;
        }
    }
}
