import Shapes.Circle;
import Shapes.Shape;
import Shapes.Triangle;
import Shapes.Rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Shape[] arr = new Shape[30];

        Shape[] List = {new Triangle(rand.nextDouble(100) + 1, rand.nextDouble(100) + 1), new Rectangle(rand.nextDouble(100) + 1, rand.nextDouble(100) + 1), new Circle(rand.nextDouble(100)+1)};

        double totalArea = 0;
        double totalPerimeter = 0;

        for(int i = 0; i < 30; i++){
            arr[i] = List[rand.nextInt(3)];
            System.out.println(i + "." + arr[i].getClass());
        }

        for(int i = 0; i < 30; i++){
           totalArea += arr[i].getArea();
           totalPerimeter += arr[i].getPerimeter();
        }

        System.out.println("The total Area is: " + totalArea);
        System.out.println("The Total Perimeter is: " + totalPerimeter);
    }
}

