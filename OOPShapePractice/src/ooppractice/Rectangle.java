package ooppractice;

import java.util.Scanner;

class Rectangle extends Shape {

    public Rectangle(){
        super();
        length = 1;
        height = 1;
    }

    private double height;
    private double length;

    Scanner scr = new Scanner(System.in);

    public void setColor() {
        System.out.println("Enter Color: ");
        color = scr.nextLine();
    }

    public void setHeight() {
        System.out.println("Enter height: ");
        height = scr.nextDouble();
    }

    public void setLength() {
        System.out.println("Enter Length: ");
        length = scr.nextDouble();
    }

    public double getArea() {
        area = (length * height);
        return area;
    }

    public void addArea(Rectangle rectangle2) {
        area += rectangle2.getArea();
    }
    public double getParameter(){
        parameter = 2 * (height + length);
        return parameter;
    }
}
