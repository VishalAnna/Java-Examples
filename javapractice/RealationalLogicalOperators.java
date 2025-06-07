package javapractice;

public class RealationalLogicalOperators {

	
	public static void main(String[] args) {
		
		
		int age = 19;
		boolean haslicense = true;
		System.out.println("age > 21 " + (age > 21));
		System.out.println("age <= 30 " + (age <= 30));
		System.out.println("age == 15 " + (age == 15));
		System.out.println("age != 25 " + (age != 25));
		
		System.out.println("Can Drive: " + (age >= 20 && haslicense ));
		System.out.println("Is teenage or senior: " +  (age >= 13 && age <= 19 || age >=65));
	
	    System.out.println("Not eligible: " + !(age >= 18));
	    
	    boolean result = (5 > 3 ) || ( 10/0 ==0);
	    System.out.println("Sysytem output short-circuit-result: " + result);
 	
	}
	
	

}
