package TernareOperator;

import java.util.Scanner;

public class Lab_04 {

	public static void main(String[] args) {
		
		System.out.println("Enter obtain score : ");
		
		Scanner input = new Scanner(System.in);
		
		int Score = input.nextInt();
		
		String Result = Score >= 50 ? "pass" : "fail";
		
		System.out.println("Result is  : " + Result);
	}

}
