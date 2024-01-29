package ooppractice;

import java.util.Scanner;

class Rectangle extends Display {
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
        System.out.println("This is the area: " + area);
        return area;
    }
}
