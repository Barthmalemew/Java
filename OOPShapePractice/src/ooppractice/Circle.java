package ooppractice;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Circle extends Shape {

    public Circle(){
        super();
        radius = 0;
    }

    private double radius;

    Scanner scr = new Scanner(System.in);

    public void setColor() {
        System.out.println("Enter the color: ");
        color = scr.nextLine();
    }

    public void setRadius() {
        System.out.println("Enter the radius: ");
        radius = scr.nextDouble();
    }

    public double getArea() {
        area = (3.14 * (radius * radius));
        return area;
    }

    public void addArea(Circle circle2){
        area += circle2.getArea();
        radius = sqrt(area / 3.14);
        System.out.println("This is the new radius: " + radius);
    }
}
