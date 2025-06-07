package javapractice;

public class NestedIfDemo {
	public static void main(String[] args) {
		int age = 14 ;
		boolean haslicence =true;
		
		if (age >= 18) {
			if (haslicence) {
				System.out.println("You can drive");
			}else {
				System.out.println("You need licence to drive");
			}
		}else {
			System.out.println("You are to young to drive");
		}
	}


}
