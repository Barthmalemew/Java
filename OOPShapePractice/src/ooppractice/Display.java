package ooppractice;

import java.util.Scanner;

public class Display {

    public Display(){
        op = 0;
    }
    public Display(int op){
        this.op = op;
    }

    int op;

    Scanner scr = new Scanner(System.in);

    public void getShape(int op) {
        System.out.println("Select a shape: 1. Circle 2. Rectangle 3. Triangle");
        op = scr.nextInt();
        switch (op) {
            case 1:
                Circle circle1 = new Circle();
                circle1.setColor();
                circle1.setRadius();
                System.out.println("This is the area: " + circle1.getArea());
                Circle circle2 = new Circle();
                circle2.setColor();
                circle2.setRadius();
                circle1.addArea(circle2);
                System.out.println("This is the area: " + circle1.getArea());
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor();
                rectangle.setHeight();
                rectangle.setLength();
                System.out.println("This is the area: " + rectangle.getArea());
                System.out.println("This is the parameter: " + rectangle.getParameter());
                Rectangle rectangle2 = new Rectangle();
                rectangle.setColor();
                rectangle.setHeight();
                rectangle.setLength();
                rectangle2.addArea(rectangle2);
                break;
            case 3:
                Triangle triangle = new Triangle();
                triangle.setColor();
                triangle.setHeight();
                triangle.setLength();
                System.out.println("This is the area: " + triangle.getArea());
                System.out.println("This is the parameter: " + triangle.getParameter());
                Triangle triangle2 = new Triangle();
                triangle.setColor();
                triangle.setHeight();
                triangle.setLength();
                triangle2.addArea(triangle2);
                break;
        }
        scr.close();
    }
}
