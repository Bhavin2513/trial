package package1;

import java.util.Random;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int upperbound=7;
		int lowerbound=1;
		
		int random_int = rand.nextInt(upperbound-lowerbound)+lowerbound;
		System.out.println(random_int);
		
	}
}
