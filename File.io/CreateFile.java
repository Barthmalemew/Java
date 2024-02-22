import java.io.PrintWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try {
            PrintWriter writer = new PrintWriter("out.txt");
            writer.println("Hello Java");
            writer.println("Hello ECU");

            writer.close();
            } catch (IOException e) {
            System.out.println("Cannot open file");
        }
    }
}
