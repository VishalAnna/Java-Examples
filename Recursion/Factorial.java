package Recursion;

import java.util.Scanner;

public class Factorial {
	public static int fact (int n) {
		if (n == 0 || n == 1) {
			return 1 ;
		}
		return n * fact(n -1);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter value: ");
		int num =input.nextInt();
		
		System.out.println(  num + " Factorial:   " + fact(num));
		
		input.close();

	}

}
