package javapractice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		// Print the weekday as per enter number 
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter your desire day number in between 1 to 7");
        int Day = input.nextInt();
        
        switch(Day) {
        	case 1 :
        		System.out.println("Monday");
        		break;
        	case 2 :
        		System.out.println("Tuesday");
        		break;
        	case 3 :
        		System.out.println("Wed");
        		break;
        	case 4 :
        		System.out.println("Thus");
        		break;
        	case 5 :
        		System.out.println("Friday");
        		break;
        	case 6 :
        		System.out.println("Sat");
        		break;
        	case 7 :
        		System.out.println("Sunday");
        	default :
        		System.out.println("No idea what day it is or You Enter wrong number ");
        		
	} input.close();
        }

}
