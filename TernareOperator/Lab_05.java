package TernareOperator;

import java.util.Scanner;

public class Lab_05 {
	public static void main(String[] args) {
		//Display if number is positive, negative or zero 
		System.out.println("Enter a number :");
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		String num = a > 0 ? "Positive" : a < 0 ? "Negative" : "Zero"; 
		
		System.out.println("number is  : "+ num);
	}

}
