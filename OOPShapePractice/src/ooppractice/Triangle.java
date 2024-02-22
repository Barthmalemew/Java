package ooppractice;

import java.util.Scanner;

class Triangle extends Shape {

    public Triangle(){
        super();
        length = 1;
        height = 1;
    }

    private double height;
    private double length;

    Scanner scr = new Scanner(System.in);

    public void setColor() {
        System.out.println("Enter Color:");
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
        area = (length * height) / 2;
        return area;
    }

    public void addArea(Triangle triangle2) {
        area += triangle2.getArea();
    }

    public double getParameter(){
        double hypo = Math.sqrt((length * length) + (height * height));
        parameter = (length + height + hypo);
        return parameter;
    }
}
