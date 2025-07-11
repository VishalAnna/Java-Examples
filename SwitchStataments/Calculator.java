package SwitchStataments;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the two numbers A and B ");
		
		double A =input.nextDouble() ;
		double B =input.nextDouble(); 
		
		System.out.println("Enter the Arithmatic operation do you want to perform \n1.Add \n2.Subtraction \n3.Multiplication \n4.Division ");
		
		
		int operation =input.nextInt()	;	
		double result = 0 ;
		
		switch (operation) {
		
		case 1 :
			result = A + B ;
			break ;
		case 2 :
			result = A - B ;
			break ;
		case 3 :
			result = A * B ;
			break ;
		case 4 :
			result = A / B ;
			break ;
		default :
			System.out.println("You Enter wrong number ");
		}
	    System.out.println("The answer for your choice arithmatic operation of " + A + " & " +  B +" = "+ result);
	    
	    input.close();
	}

}
