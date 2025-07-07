package Recursion;

import java.util.Scanner;

public class DigitSum {
	
	public static int digit(int n ) {
		if ( n < 10) {
			return n;
		}
		return n % 10 + digit (n /10);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value");
		int num =input.nextInt();
		System.out.println("Sum of " + num + " is: " + digit(num));
		
		input.close();
		

	}

}
