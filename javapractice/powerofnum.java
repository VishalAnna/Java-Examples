package javapractice;

public class powerofnum {

	public static void main(String[] args) {
		
		int base = 3, exponent = 4;
		 long result = 1 ;
		 
//		 
//		 while (exponent != 0) {
//			 result =result * base;
//			 --exponent;
//		 }
//		 System.out.println("Answer = "+ result);

		for (;exponent != 0 ; --exponent) {
			result = result * base;
			
		}
		System.out.println("Answer= " + result);
	}

}
