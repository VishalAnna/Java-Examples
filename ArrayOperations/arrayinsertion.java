package ArrayOperations;

public class arrayinsertion {

	public static void main(String[] args) {
		
		//declare
		int[] num = {1,2,3,4,5}; //to hold 5 int
		System.out.println("Intial Num: " + num);
		
		
		
		//insert 
		for (int i=0 ; i< num.length; i++) {
			num[i] = (i+1) ;
			
		}
		System.out.println("Num after values insert: ");
		

	}

}
