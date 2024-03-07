package eclipse_SetUp;

import java.util.Scanner;

public class FirstJava {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.println("Please enter two integers");
		
		int a;
		int b;
		
		Scanner myInput = new Scanner(System.in);
		a = myInput.nextInt();
		b = myInput.nextInt();
		
		System.out.println("The sum of the two numbers is: " + (a + b));
		
		myInput.close();
	}

}
