package javapractice;

public class binarytodecimal {
	public static void main(String[] args) {
		
		long num = 1101;
		int decimal =convertbinarytodecimal(num);
		
		System.out.println("Binary to decimal");
		System.out.println(num + " = " + decimal);
		
	}	
	public static int convertbinarytodecimal(long num) {
		
		int decimalnum= 0 , i= 0;
		long remainder ;
		
		while(num != 0) {
			remainder = num % 10;
			num = num /10 ;
			decimalnum += remainder * Math.pow(2,i);
			++i;
		}
		return decimalnum;
	}
}
