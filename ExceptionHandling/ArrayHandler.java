package ExceptionHandling;

public class ArrayHandler {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		
		try {
			System.out.println(numbers[8]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index! max index is " + (numbers.length -1));
			
		}
	}

}
