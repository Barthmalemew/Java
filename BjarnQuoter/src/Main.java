import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile readFile = new ReadFile();
        GenerateQuote generateQuote = new GenerateQuote();
        List<String> quotes = new ArrayList<>();
        readFile.getFile(quotes);
        generateQuote.getQuote(quotes);
    }
}

class ReadFile {
    void getFile(List<String> quotes) throws FileNotFoundException {
        //needs to be in function because while it is creating an object
        //it is also opens the stream to file
        // for better practices always create objects in function.
        File file = new File("/home/barthmalemew/Projects/Java/BjarnQuoter/src/Bjarne_Quotes.txt");
        Scanner scr = new Scanner(file);

        while(scr.hasNextLine())
        {
            quotes.add(scr.nextLine());
        }
    }
}

class GenerateQuote{
    int n;
    void getQuote(List<String>quotes){
        n = (int) (Math.random() * 65);
        System.out.println(quotes.get(n));
    }
}