package TernareOperator;

import java.util.Scanner;

public class Lab_02 {

	public static void main(String[] args) {
		
		
		// max between three a,b,c
//		int a,b,c;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();    // reads entire line with whitespace
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = a > b & a > c  ? a : b >c ? b : c ;
		
		System.out.println("Max  " + max);

	}

}
