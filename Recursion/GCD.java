package Recursion;

import java.util.Scanner;

public class GCD {

		public static int gcd(int a ,int b) {
			if (b == 0) {
				return a;
			}
			return gcd(b,a % b);
		}
		public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			
			System.out.println("Enter values: ");
			
			int num1 =input.nextInt();
			int num2 = input.nextInt();
			
			System.out.println("Gcd of " + num1 + " & "  + num2 + " is " + gcd(num1,num2));
			
			input.close();

	}

}
