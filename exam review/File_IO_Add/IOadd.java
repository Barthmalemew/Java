import java.io.*;
import java.util.*;

public class IOadd {
    public static void main(String[] arg){
        try{
            File directory = new File("../File_IO_Add/files/");
            File[] listOfFiles = directory.listFiles();
            File output = new File("Script.txt");
            PrintWriter Print = new PrintWriter(output);

            for(File file : listOfFiles) {
                int i = 1;
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    String s = i + ". " + scan.nextLine() + "\n";
                    Print.write(s);
                    i++;
                }
                Print.close();
            }

        }catch (FileNotFoundException e){
            System.err.println("Error");
        }
    }
}
