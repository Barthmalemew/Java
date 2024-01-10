import java.util.Scanner;
import java.util.Random;

public class FirstJava {
    public static void main(String[] args)
    {
        System.out.println("Hello Java!");
        System.out.println("Please enter an integer: ");

        Random rand = new Random();
        Math myOutput = new Math();
        Scanner myInput = new Scanner(System.in);

        myOutput.x = myInput.nextInt();
        myOutput.y = rand.nextInt(100);

        System.out.println(myOutput.y);

        myOutput.output();

        myInput.close();
    }
}

class Math
{
    int x;
    int y;
    void output()

    {
        System.out.println("The sum of the two numbers is:" + (x + y));
    }
}
