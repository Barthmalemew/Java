package random;

import java.util.Random;

public class RandomPizza {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int op = rand.nextInt(4) + 1;
		
		switch (op) {
			case 1: case 2:{
				System.out.println("Pizza");
				break;
			}
			case 3: {
				System.out.println("Bibimbap");
				break;
			}
			case 4: {
				System.out.println("Couscous");
				break;
			}
		}
	}

}
