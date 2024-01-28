package ooppractice;

import java.util.Scanner;

class Circle extends Display {

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
        System.out.println("This is the area" + area);
        return area;
    }
}
