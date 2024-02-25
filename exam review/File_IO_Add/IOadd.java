import java.io.*;
import java.util.*;

public class IOadd {
    public static void main(String[] arg){
        try{

            int j = 1;
            int i;

            for(i = 1; i <= 3; i++) {
                Scanner sc1 = new Scanner(new File("files/File" + i + ".txt"));
                PrintWriter print = new PrintWriter(new FileOutputStream("Script.txt", true));

                while (sc1.hasNextLine()) {
                    String s = j + ". " + sc1.nextLine();
                    print.println(s);
                    j++;
                }
                print.close();
                sc1.close();
            }

        }catch (FileNotFoundException e){
            System.err.println("Error");
        }
    }
}
