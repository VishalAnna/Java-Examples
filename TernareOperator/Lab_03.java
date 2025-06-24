package TernareOperator;
import java.util.*;
public class Lab_03 {
	public static void main(String[] args) {
		
		// Even or odd
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you want to check : ");
		int a = input.nextInt();
		
		String num = a % 2 == 0 ? "Even" : "Odd"; 
		
		System.out.println("The number is " + num );
		
	}

}
