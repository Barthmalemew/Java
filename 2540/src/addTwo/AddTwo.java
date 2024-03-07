package addTwo;

import java.util.Scanner;

public class AddTwo {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two integers:");
		int a = scr.nextInt();
		int b = scr.nextInt();
		System.out.println("The two integers you entered are: " + a + " and " + b);
		
		System.out.println("Enter two double numbers:");
		double c = scr.nextDouble();
		double d = scr.nextDouble();
		System.out.println("The two double numbers you entered are: " + c + " and " + d);
		
		System.out.println("Enter two words:");
		String e = scr.next();
		String f = scr.next();
		scr.nextLine();
		System.out.println("The two words you entered are: " + e + " " + f);
		
		System.out.println("Enter the first senctence:");
		String g = scr.nextLine();
		System.out.println("Enter the second sentence:");
		String h = scr.nextLine();
		System.out.println("The first sentence you entered is: " + g);		
		System.out.println("The first sentence you entered is: " + h);		
		}
}
