package javapractice;

public class reversenumber {
	public static void main(String[] args) {
		//reverse a number using while loop 
		
//		int num =123456789;
//		long rev = 0;
//		while(num !=0 ) {
//			int last_no= num % 10 ;
//			rev =rev * 10 + last_no ;
//			
//			num = num / 10;
//		}
//		System.out.println("Reversed number = " + rev);
		
		//reverse anumber using for loop 
		int num =12345;
		int reversed = 0;
		
		for (;num != 0 ; num /= 10) {
			int digit = num % 10;
			reversed =reversed * 10 + digit ;	
		}
		System.out.println("Reversed number = " + reversed);
	}
}
