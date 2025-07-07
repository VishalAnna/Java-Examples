package Recursion;

import java.util.Scanner;

public class PowerCal {
	
	public static double pow(double base, int exp) {
		if (exp == 0 ) {
			return 1;
			
		}
		if (exp > 0) {
			return base * pow(base, exp -1);
		}else{
			return 1 / (base * pow (base, -exp - 1));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter both numbers : ");
		double first = input.nextDouble();
		int second = input.nextInt();
		
		System.out.printf("%,.2f ^ %d \n", first,second);
		System.out.println(pow(first,second));

		input.close();
		

	}

}
