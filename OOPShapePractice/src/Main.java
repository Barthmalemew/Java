import ooppractice.Display;
import ooppractice.Shape;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] arr = new Shape[rand.nextInt(30)];
        Display display = new Display();

        for (int i = 0; i < 30; i++)
        {
            arr[i] = display.getShape(rand.nextInt(3));
        }
    }
}

