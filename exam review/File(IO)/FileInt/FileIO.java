package FileInt;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileIO {
	public static void main(String[] args)
	{
		int sum = 0;
		try {
			File myFile = new File("int.txt");
			Scanner scr = new Scanner(myFile);
			
			while(scr.hasNextInt()) {
				sum += scr.nextInt();
			}
			
			scr.close();
			
			System.out.println(sum);

			
		} catch (FileNotFoundException e){
			System.out.println("An error has occured while reading file");
			e.printStackTrace();
			}
	}
}
